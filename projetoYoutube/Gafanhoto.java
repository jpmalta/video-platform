package projetoYoutube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

     // Construtor que inclui os atributos da classe base e os específicos
     public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); 
        this.login = login;
        this.totAssistido = 0;
    }

    // Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                super.toString() +
                ", \nlogin='" + login + '\'' +
                ", \ntotAssistido=" + totAssistido +
                '}';
    }
}
