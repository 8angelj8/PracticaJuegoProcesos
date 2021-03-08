package entities;

import java.net.InetAddress;

public class Jugador {
    private static String nickname;
    private static Boolean anfitrion;
    private int puerto;
    private InetAddress addres;
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

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public InetAddress getAddres() {
        return addres;
    }

    public void setAddres(InetAddress addres) {
        this.addres = addres;
    }
}
