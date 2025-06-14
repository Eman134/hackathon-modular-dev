package src.com.github.eman134.hackathon.model;

import src.com.github.eman134.hackathon.base.Instituicao;

public class Empresa extends Instituicao {

    public Empresa(String nome) {
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
