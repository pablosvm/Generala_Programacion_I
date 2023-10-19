public enum dados {
    Uno(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6);
    private int valor;
    private dados(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
}
