package servidor;

import entities.Jugador;
import entities.Partida;
import entities.TipoPartida;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class Peticion implements Runnable {
    private Map<TipoPartida, Partida> mapaEspera = new HashMap<>();  // mapa(tipo, partida en juego)
    private Map<Integer, Partida> mapaJuego = new HashMap<>();  //  mapa(idPartida, partidas espera)
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


