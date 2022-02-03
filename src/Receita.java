import java.util.ArrayList;
import java.util.List;

public class Receita {

    private String Nome;
    private TempoPreparo tempoPreparo;
    private Categoria categoria;
    private Rendimento rendimento;
    private List<Ingrediente> ingredientes;
    private StringBuilder preparo;

    public Receita(String nome) {
        Nome = nome;
        preparo = new StringBuilder();
        ingredientes = new ArrayList<Ingrediente>();
    }

    public TempoPreparo getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(double tempo, UnidadeTempo unidadeTempo) {
        this.tempoPreparo = new TempoPreparo(tempo, unidadeTempo );
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setRendimento(int quantidade, Tipo tipo) {
        this.rendimento = new Rendimento(quantidade, tipo);
    }

    public void addIngrediente(String nome, int quantidade, Tipo tipo){
        ingredientes.add( new Ingrediente(nome, quantidade, tipo) );
    }

    public void addPreparo(String texto) {
        this.preparo.append("\t- " + texto + "\n" );
    }

    @Override
    public String toString() {
        return "Receita de: " + Nome + "\n\t" +
                "- " + tempoPreparo.toString() + "\n\t" +
                "- Categoria: " + categoria + "\n\t" +
                "- Rendimento: " + rendimento + "\n" +
                "* Ingredientes: "  + '\n' + listarIngredientes(ingredientes) +
                "* Forma de preparo: "  + '\n' + preparo;

    }

    private Object listarIngredientes(List<Ingrediente> ingredientes) {
        StringBuilder lista = new StringBuilder();
        for ( Ingrediente ingrediente: ingredientes) {
            lista.append(ingrediente.toString());
        }
        return lista;
    }

}
