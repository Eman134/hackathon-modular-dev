package src.com.github.eman134.hackathon.base;

public abstract class Instituicao {

    protected String nome;

    public Instituicao(String nome) {
        this.nome = nome;
    }

    public abstract String getNome();
    public abstract void setNome(String nome);

}