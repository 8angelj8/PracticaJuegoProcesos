package cliente;

import java.util.concurrent.Semaphore;

public class JugadorSocketStream {
    static Semaphore partida = new Semaphore(2);

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            Jugador j = new Jugador(i);
            j.start();
            i++;
        }
    }
}

