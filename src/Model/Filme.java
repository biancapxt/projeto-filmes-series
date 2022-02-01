package Model;

public class Filme {

    private int id;
    private String nome;
    private String genero;
    private int ano;
    private int assistido;

    public Filme(int id, String nome, String genero, int ano, int assistido) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.assistido = assistido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAssistido() {
        return assistido;
    }

    public void setAssistido(int assistido) {
        this.assistido = assistido;
    }

}
