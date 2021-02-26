import java.util.List;

public class Partida {

    private int numAleatorio, numAleatorio2;
    private static int idPartida;
    private static int tipoPartida;
    private static int numJugadores;
    private static List<String> listaJugadores;

    private int aleatorioInvitado() {
        numAleatorio = (int) (Math.random()*6 + 1);
        return numAleatorio;
    }

    private int aleatorioHost() {
        numAleatorio2 = (int) (Math.random()*6 + 1);
        return numAleatorio2;
    }

    public void partida() {

        if (numAleatorio > numAleatorio2) {
            System.out.println("Jugador Invitado gana");
        } else if (numAleatorio2 > numAleatorio) {
            System.out.println("Jugador Host gana");
        } else if (numAleatorio == numAleatorio2) {
            System.out.println("Empate");
        }

    }
}
