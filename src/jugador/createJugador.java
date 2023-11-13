package jugador;

public class createJugador {
    protected String[] jugadores;

    public createJugador(int cantidadJugadores) {
        if (cantidadJugadores < 2 || cantidadJugadores > 5) {
            throw new IllegalArgumentException("La cantidad de jugadores debe estar entre 2 y 5.");
        }
        jugadores = new String[cantidadJugadores];
    }

    public void crearJugadores() {
        // Implementa la lógica para crear jugadores aquí.
    }

    public String[] getJugadores() {
        return jugadores;
    }
}