package src.com.github.eman134.hackathon.model;

import src.com.github.eman134.hackathon.base.IAvaliavel;

import java.util.HashMap;
import java.util.Map;

public class Banca implements IAvaliavel {

    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados = new HashMap<>();

    @Override
    public Double calcularNotaFinal() {
        return jurados.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
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

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }
}
