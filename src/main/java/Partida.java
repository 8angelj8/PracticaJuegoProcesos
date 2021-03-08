import java.util.List;

public class Partida implements Runnable{

    private static int idPartida;
    private static int nextId=0;
    private static int tipoPartida;
    private static int numJugadores;
    private static List<String> listaJugadores;

    public Partida (){

    }

    public static int getIdPartida() {
        return idPartida;
    }

    public static void setIdPartida(int idPartida) {
        Partida.idPartida = idPartida;
    }

    public static int getTipoPartida() {
        return tipoPartida;
    }

    public static void setTipoPartida(int tipoPartida) {
        Partida.tipoPartida = tipoPartida;
    }

    public static int getNumJugadores() {
        return numJugadores;
    }

    public static void setNumJugadores(int numJugadores) {
        Partida.numJugadores = numJugadores;
    }

    public static List<String> getListaJugadores() {
        return listaJugadores;
    }

    public static void setListaJugadores(List<String> listaJugadores) {
        Partida.listaJugadores = listaJugadores;
    }

    public int nextId() {
        this.nextId++;
        return this.nextId();
    }
    @Override
    public void run() {

    }


}
