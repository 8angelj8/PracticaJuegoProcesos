package cliente;

import java.util.List;

public class Partida {

    private int numAleatorio, numAleatorio2;

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
            System.out.println("cliente.Jugador Invitado gana");
        } else if (numAleatorio2 > numAleatorio) {
            System.out.println("cliente.Jugador Host gana");
        } else if (numAleatorio == numAleatorio2) {
            System.out.println("Empate");
        }

    }
}
