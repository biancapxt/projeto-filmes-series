package Model;

public class Serie {

    private int id;
    private String nome;
    private String genero;
    private int temporadas;
    private int assistido;

    public Serie(int id, String nome, String genero, int temporadas, int assistido) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAssistido() {
        return assistido;
    }

    public void setAssistido(int assistido) {
        this.assistido = assistido;
    }

}
