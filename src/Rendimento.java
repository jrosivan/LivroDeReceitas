public class Rendimento {
    int quantidade;
    Tipo tipo;

    public Rendimento(int quantidade, Tipo tipo) {
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return quantidade + " " + tipo;
    }
}
