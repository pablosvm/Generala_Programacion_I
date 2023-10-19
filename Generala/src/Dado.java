public enum Dado{
    Uno(1),
    DOS (2),
    TRES (3),
    CUATRO(4),
    CINCO(5),
    SEIS(6);

    private int valor;
    private Dado (int valor) {
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
}
