public class CatalogoReceitas {

    public static void main(String[] args) {

        Receita receitas = new Receita("BOLO DE MILHO");

        receitas.setTempoPreparo(45.0D, UnidadeTempo.MINUTOS);
        receitas.setCategoria(Categoria.SALGADO);
        receitas.setRendimento(5, Tipo.PRATO);

        receitas.addIngrediente("MILHO", 10, Tipo.UNIDADE);
        receitas.addIngrediente("AÇÚCAR", 2, Tipo.COLHER_DE_SOPA);
        receitas.addIngrediente("LEITE", 1, Tipo.LITRO);

        receitas.addPreparo("Ralar o milho e bater no liquidificador");
        receitas.addPreparo("Misturar o milho ralado com o açúcar e o leite");
        receitas.addPreparo("Ferver por 10 minutos");
        receitas.addPreparo("Colocar a massa em uma bandeja e assar por 30 minutos em fogo baixo");
        receitas.addPreparo("Servir frio, que quente queima a boca!");

        System.out.println(receitas.toString());

    }


}
