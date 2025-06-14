package src.com.github.eman134.hackathon.base;

public abstract class Pessoa {

    protected Instituicao instituicao;
    protected String nome;

    public Pessoa(String nome, Instituicao instituicao) {
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public abstract void setInstituicao(Instituicao instituicao);
    public abstract Instituicao getInstituicao();
    public abstract void setNome(String nome);
    public abstract String getNome();

}
