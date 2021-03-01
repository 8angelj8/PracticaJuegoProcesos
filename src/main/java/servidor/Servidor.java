package servidor;

import entities.Partida;
import entities.TipoPartida;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Servidor {
    private Map<TipoPartida, Partida> mapaEspera = new HashMap<>();  // mapa(tipo, partida en juego)
    private Map<Integer, Partida> mapaJuego = new HashMap<>();   //  mapa(idPartida, partidas espera)

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
