package src.com.github.eman134.hackathon.repository;

import src.com.github.eman134.hackathon.model.Apresentacao;

import java.util.ArrayList;
import java.util.List;

public class ApresentacaoRepository {

    private static ApresentacaoRepository instance;
    private static List<Apresentacao> apresentacoes;

    private ApresentacaoRepository() {
        apresentacoes = new ArrayList<>();
    }

    public static ApresentacaoRepository getInstance() {
        if (instance == null) {
            instance = new ApresentacaoRepository();
        }
        return instance;
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    public void addApresentacao(Apresentacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public void removeApresentacao(Apresentacao apresentacao) {
        apresentacoes.remove(apresentacao);
    }
}
