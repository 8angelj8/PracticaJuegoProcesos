package servidor;

import java.io.*;
import java.net.Socket;

public class Peticion implements Runnable {
    private Socket socket;

    public Peticion(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (InputStream is = socket.getInputStream();
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader bfr = new BufferedReader(isr);
             OutputStream os = socket.getOutputStream();
             PrintWriter pw = new PrintWriter(os)) {

            String mensaje = bfr.readLine();
            System.out.println(mensaje);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
