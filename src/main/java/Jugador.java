import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Jugador extends Thread {

    private Partida partida;

    public Jugador(int i) {
        this.setName("Jugador " + String.valueOf(i));
    }

    public void run() {
        try (Socket clientSocket = new Socket()) {

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            clientSocket.connect(addr);
            clientSocket.getLocalPort();

            try (InputStream is = clientSocket.getInputStream();
                 OutputStream os = clientSocket.getOutputStream();
                 InputStreamReader isr = new InputStreamReader(is);
                 OutputStreamWriter osw = new OutputStreamWriter(os);
                 BufferedReader bReader = new BufferedReader(isr);
                 PrintWriter pWriter = new PrintWriter(osw);) {

                JugadorSocketStream.partida.acquire();

                juega();

                System.out.println(getName() + " ha terminado y se marcha");
                JugadorSocketStream.partida.release();

                String mensaje = this.getName();
                pWriter.print(mensaje);
                pWriter.flush();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void juega() throws InterruptedException {
        partida = new Partida();
        partida.partida();
        sleep(1000);
    }
}
