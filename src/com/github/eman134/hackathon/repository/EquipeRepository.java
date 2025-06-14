package src.com.github.eman134.hackathon.repository;

import src.com.github.eman134.hackathon.model.Equipe;

import java.util.List;

public class EquipeRepository {

    private static EquipeRepository instance;
    private static List<Equipe> equipes;

    public static EquipeRepository getInstance() {
        if (instance == null) {
            instance = new EquipeRepository();
        }
        return instance;
    }

    public static List<Equipe> getEquipes() {
        return equipes;
    }

    public static void addEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public static void removeEquipe(Equipe equipe) {
        equipes.remove(equipe);
    }

}
