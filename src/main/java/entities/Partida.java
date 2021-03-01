package entities;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private static int idPartida;
    private List<Jugador> listajugadores;
    private TipoPartida tipo;
    private static int numJugadores;

    public static int getIdPartida() {
        return idPartida;
    }

    public static void setIdPartida(int idPartida) {
        Partida.idPartida = idPartida;
    }

    public List<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(List<Jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }

    public TipoPartida getTipo() {
        return tipo;
    }

    public void setTipo(TipoPartida tipo) {
        this.tipo = tipo;
    }

    public static int getNumJugadores() {
        return numJugadores;
    }

    public static void setNumJugadores(int numJugadores) {
        Partida.numJugadores = numJugadores;
    }
}
