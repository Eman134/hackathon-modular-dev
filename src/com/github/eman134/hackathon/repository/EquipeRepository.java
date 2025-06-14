package src.com.github.eman134.hackathon.repository;

import src.com.github.eman134.hackathon.model.Equipe;

import java.util.ArrayList;
import java.util.List;

public class EquipeRepository {

    private static EquipeRepository instance;
    private List<Equipe> equipes;

    private EquipeRepository() {
        equipes = new ArrayList<>();
    }

    public static EquipeRepository getInstance() {
        if (instance == null) {
            instance = new EquipeRepository();
        }
        return instance;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void addEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void removeEquipe(Equipe equipe) {
        equipes.remove(equipe);
    }

    public Equipe buscarPorNome(String nome) {
        return equipes.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
