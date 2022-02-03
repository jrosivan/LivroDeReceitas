public class Ingrediente {
    private String nome;
    private double quantidade;
    Tipo tipo;

    public Ingrediente(String nome, double quantidade, Tipo tipo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\t-" + nome + "\t- " + quantidade + " " + tipo + '\n';
    }

}
