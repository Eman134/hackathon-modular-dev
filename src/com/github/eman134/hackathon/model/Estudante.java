package src.com.github.eman134.hackathon.model;

import src.com.github.eman134.hackathon.base.Instituicao;
import src.com.github.eman134.hackathon.base.Pessoa;

public class Estudante extends Pessoa {

    public Estudante(String nome, Instituicao instituicao) {
        super(nome, instituicao);
    }

    @Override
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public Instituicao getInstituicao() {
        return this.instituicao;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
