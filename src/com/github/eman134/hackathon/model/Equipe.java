package src.com.github.eman134.hackathon.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nome;
    private List<Estudante> membros;

    public Equipe(String nome){
        membros = new ArrayList<Estudante>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addMembro(Estudante membro) {
        membros.add(membro);
    }

    public void removeMembro(Estudante membro) {
        membros.remove(membro);
    }

}
