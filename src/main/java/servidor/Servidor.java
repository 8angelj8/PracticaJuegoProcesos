package servidor;

import entities.TipoPartida;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Semaphore;

public class Servidor {
    public static Semaphore mutex = new Semaphore(1);
    public static Semaphore dadosJugadores = new Semaphore(1 - (TipoPartida.JUEGO.getNumJugadores() - 1));

    public static void inicia() throws IOException {
        Socket newSocket = null;
        try (ServerSocket serverSocket = new ServerSocket();) {
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            serverSocket.bind(addr);
            while (true) {

                newSocket = serverSocket.accept();
                Peticion p = new Peticion(newSocket);
                Thread hilo = new Thread(p);
                hilo.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (newSocket != null) {
                newSocket.close();
            }
        }
    }
}
