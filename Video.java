public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

     // Getter e Setter para titulo
     public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter e Setter para avaliacao
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    // Getter e Setter para views
    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    // Getter e Setter para curtidas
    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    // Getter e Setter para reproduzindo
    public boolean isReproduzindo() { // Método para boolean começa com 'is'
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }
}
