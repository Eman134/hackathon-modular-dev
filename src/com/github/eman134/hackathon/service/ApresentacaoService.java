package src.com.github.eman134.hackathon.service;

import src.com.github.eman134.hackathon.model.Apresentacao;
import src.com.github.eman134.hackathon.model.Projeto;
import src.com.github.eman134.hackathon.repository.ApresentacaoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ApresentacaoService {

    private final ApresentacaoRepository repository = ApresentacaoRepository.getInstance();

    public void calcularNotasFinais() {
        for (Apresentacao apresentacao : repository.getApresentacoes()) {
            apresentacao.avaliar();
        }
    }

    public List<Projeto> getProjetosAprovados() {
        return repository.getApresentacoes().stream()
                .map(Apresentacao::getProjeto)
                .filter(projeto -> projeto.getNotaFinal() >= 7)
                .collect(Collectors.toList());
    }

    public void addApresentacao(Apresentacao apresentacao) {
        repository.addApresentacao(apresentacao);
    }

}
