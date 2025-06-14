package src.com.github.eman134.hackathon.model;

public class Projeto {

    private Profissional orientador;
    private Equipe equipe;
    private Double notaFinal;
    private String nomeProjeto;

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public Projeto(String nomeProjeto, Profissional orientador, Equipe equipe) {
        this.orientador = orientador;
        this.nomeProjeto = nomeProjeto;
        this.equipe = equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
