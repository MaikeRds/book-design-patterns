package org.example.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um departamento
public class Departamento implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibirDados() {
        System.out.println("Departamento: " + nome);

        for (Componente componente : componentes) {
            componente.exibirDados();
        }
    }
}


