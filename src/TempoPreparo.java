public class TempoPreparo {
    private Double tempo;
    private UnidadeTempo unidadeTempo;

    public TempoPreparo(Double tempo, UnidadeTempo unidadeTempo) {
        this.tempo = tempo;
        this.unidadeTempo = unidadeTempo;
    }

    @Override
    public String toString() {
        return "Tempo de preparo: " + tempo + " " + unidadeTempo;
    }
}
