package jugador;

public class crearJugador extends createJugador {
    public crearJugador(int cantidadJugadores) {
        super(cantidadJugadores);
    }

    @Override
    public void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = "Jugador " + (i + 1);
        }
    }
}