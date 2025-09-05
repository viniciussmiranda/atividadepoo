public class Filme {
    private String titulo, genero;
    private int anoLancamento;


    public Filme(String titulo, String genero, int anoLancamento) {  //primeiro construtor
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(anoLancamento);
    }

    public Filme(String titulo, String genero) {  // segundo construtor
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String toString() {
        return titulo + " " + genero + " " + anoLancamento;
    }

}