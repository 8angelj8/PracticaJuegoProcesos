package entities;

public class Jugador {
    private static String nickname;
    private static Boolean anfitrion;
    private Partida partida;

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

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
