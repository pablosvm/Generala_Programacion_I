package juego;

public class participante {
    private String nombre;
    private Dados dados;
    private int[] puntajes;

    public participante(String nombre) {
        this.nombre = nombre;
        this.dados = new Dados();
        this.puntajes = new int[5];
    }
}
