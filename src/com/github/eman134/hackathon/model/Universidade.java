package src.com.github.eman134.hackathon.model;

import src.com.github.eman134.hackathon.base.Instituicao;

public class Universidade extends Instituicao {

    public Universidade(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
