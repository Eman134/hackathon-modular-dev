package src.com.github.eman134.hackathon.model;

import src.com.github.eman134.hackathon.base.IAvaliavel;

import java.time.LocalDateTime;

public class Apresentacao {

    private Projeto projeto;
    private IAvaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public void avaliar() {
        Double notaFinal = banca.calcularNotaFinal();
        projeto.setNotaFinal(notaFinal);
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public IAvaliavel getBanca() {
        return banca;
    }

    public void setBanca(IAvaliavel banca) {
        this.banca = banca;
    }

    public Sala getLocal() {
        return local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
