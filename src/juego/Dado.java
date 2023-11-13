package juego;

import java.util.Random;

public class Dado {
    private int valor;

    public void tirar() {
        Random random = new Random();
        valor = random.nextInt(6) + 1;
    }

    public int getValor() {
        return valor;
    }
}
