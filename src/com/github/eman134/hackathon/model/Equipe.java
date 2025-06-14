package src.com.github.eman134.hackathon.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private List<Estudante> membros;

    public Equipe(){
        membros = new ArrayList<Estudante>();
    }

    public void addMembro(Estudante membro) {
        membros.add(membro);
    }

    public void removeMembro(Estudante membro) {
        membros.remove(membro);
    }

}
