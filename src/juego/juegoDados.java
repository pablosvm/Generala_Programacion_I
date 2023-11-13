
package juego;
import jugador.createJugador;
import jugador.crearJugador;
import java.util.ArrayList;
import java.util.List;

public class juegoDados {
    private List<participante> participantes;
    private Dados dados;
    private int tiradas;

    public juegoDados(int cantidadParticipantes) {
        this.participantes = new ArrayList<>();
        this.dados = new Dados();
        crearJugador createJugador = new crearJugador(cantidadParticipantes);
        createJugador.crearJugadores();
        for (String nombre : createJugador.getJugadores()) {
            participantes.add(new participante(nombre));
        }
        this.tiradas = 0;
    }

    public void realizarTirada(boolean[] seleccionados) {
        if (tiradas < 3) {
            for (int i = 0; i < dados.getDados().length; i++) {
                if (!seleccionados[i]) {
                    dados.getDado(i).tirar();
                }
            }
            tiradas++;
        }
    }

    public int[] obtenerValoresDados() {
        int[] valores = new int[dados.getDados().length];
        for (int i = 0; i < dados.getDados().length; i++) {
            valores[i] = dados.getDado(i).getValor();
        }
        return valores;
    }

    public int getTiradasRestantes() {
        return 3 - tiradas;
    }
}
