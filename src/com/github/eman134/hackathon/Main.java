package src.com.github.eman134.hackathon;

import src.com.github.eman134.hackathon.base.Instituicao;
import src.com.github.eman134.hackathon.model.*;
import src.com.github.eman134.hackathon.repository.ApresentacaoRepository;
import src.com.github.eman134.hackathon.repository.EquipeRepository;
import src.com.github.eman134.hackathon.service.ApresentacaoService;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Instituicao PucMinas = new Universidade("Puc Minas");

        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");

        for (int i = 1; i <= 5; i++) {
            Estudante estudanteTemporario = new Estudante("Estudante " + (i+1), PucMinas);
            equipe1.addMembro(estudanteTemporario);
            equipe2.addMembro(estudanteTemporario);
        }

        Profissional orientador1 = new Profissional("Prof. Ana", PucMinas);
        Profissional orientador2 = new Profissional("Prof. João", PucMinas);
        Projeto projeto1 = new Projeto("Projeto 1", orientador1, equipe1);
        Projeto projeto2 = new Projeto("Projeto 2", orientador2, equipe2);

        Banca banca1 = new Banca();
        Banca banca2 = new Banca();

        for (int i = 1; i <= 4; i++) {
            banca1.addJuradoNota(new Jurado("JuradoA" + i, PucMinas), 6 + i);
            banca2.addJuradoNota(new Jurado("JuradoB" + i, PucMinas), 5 + i);
        }

        Sala local = new Sala("Sala 1");

        Apresentacao apresentacao1 = new Apresentacao();
        apresentacao1.setProjeto(projeto1);
        apresentacao1.setBanca(banca1);
        apresentacao1.setDataHora(LocalDateTime.now());
        apresentacao1.setLocal(local);

        Apresentacao apresentacao2 = new Apresentacao();
        apresentacao2.setProjeto(projeto2);
        apresentacao2.setBanca(banca2);
        apresentacao2.setDataHora(LocalDateTime.now());
        apresentacao2.setLocal(local);

        ApresentacaoService apresentacaoService = new ApresentacaoService();

        apresentacaoService.addApresentacao(apresentacao1);
        apresentacaoService.addApresentacao(apresentacao2);
        EquipeRepository.getInstance().addEquipe(equipe1);
        EquipeRepository.getInstance().addEquipe(equipe2);

        apresentacaoService.calcularNotasFinais();

        System.out.println("Projetos aprovados:");
        apresentacaoService.getProjetosAprovados().forEach(proj ->
                System.out.println(proj.getNomeProjeto() + " - Nota Final: " + proj.getNotaFinal())
        );

    }

}
