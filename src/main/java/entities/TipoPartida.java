package entities;

public enum TipoPartida {

    JUEGO("dados", 2);

    private String nombreJuego;
    private int numJugadores;

    private TipoPartida(String juego, int jugadores) {
        this.nombreJuego = juego;
        this.numJugadores = jugadores;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
}
