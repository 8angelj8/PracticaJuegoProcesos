import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Jugador extends Thread{

    private static String nickname;
    private static Boolean anfitrion;

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        Jugador.nickname = nickname;
    }

    public static Boolean getAnfitrion() {
        return anfitrion;
    }

    public static void setAnfitrion(Boolean anfitrion) {
        Jugador.anfitrion = anfitrion;
    }

    @Override
    public void run(){
        try (Socket clientSocket = new Socket()) {
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            clientSocket.connect(addr);

            System.out.println("Empezando partida nueva");

            enviarNombreTipo(clientSocket);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void enviarNombreTipo(Socket clientSocket) {
        try (OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            PrintWriter pWriter = new PrintWriter(osw);) {
            String mensaje = this.getNickname();
            pWriter.print(mensaje);
            pWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
