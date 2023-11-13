package juego;

import java.util.Random;

public class Dados {
    private Dado[] dados;

    public Dados() {
        this.dados = new Dado[5];
        inicializarDados();
    }

    private void inicializarDados() {
        for (int i = 0; i < dados.length; i++) {
            dados[i] = new Dado();
        }
    }

    public Dado[] getDados() {
        return dados;
    }

    public Dado getDado(int index) {
        return dados[index];
    }

    public void tirarTodos() {
        for (Dado dado : dados) {
            dado.tirar();
        }
    }

    public int[] getValores() {
        int[] valores = new int[dados.length];
        for (int i = 0; i < dados.length; i++) {
            valores[i] = dados[i].getValor();
        }
        return valores;
    }

    public void tirarSeleccionados(boolean[] seleccionados) {
        for (int i = 0; i < dados.length; i++) {
            if (seleccionados[i]) {
                dados[i].tirar();
            }
        }
    }
}
