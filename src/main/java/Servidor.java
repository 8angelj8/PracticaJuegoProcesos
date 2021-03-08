import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Servidor {

    private Map<Integer,Partida> partidasEspera= new HashMap<>();
    private Map<Integer,Partida> partidasJuego= new HashMap<>();

    public static void main(String[] args) throws IOException {
        Socket newSocket = null;
        try (ServerSocket serverSocket = new ServerSocket();) {
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            serverSocket.bind(addr);
            while (true) {
                Partida partida = new Partida();
                partida.setIdPartida(partida.nextId());
                partida.setTipoPartida(1);
                partida.setNumJugadores(2);
                Thread hilo = new Thread(partida);
                hilo.start();
                newSocket = serverSocket.accept();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            if (newSocket != null) {
                newSocket.close();
            }
        }
    }

}
