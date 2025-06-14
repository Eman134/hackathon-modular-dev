package src.com.github.eman134.hackathon.model;

import java.util.Map;

public class Banca {

    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Double calcularNotaFinal() {
        return jurados.values().stream().mapToInt(nota -> nota).average().getAsDouble();
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public void addJuradoNota(Jurado jurado, int nota) {
        jurados.put(jurado, nota);
    }

    public void removeJurado(Jurado jurado) {
        jurados.remove(jurado);
    }

}
