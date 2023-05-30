package org.example.design_patterns.structural.composite;

// Classe que representa um funcionário
public class Funcionario implements Componente {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDados() {
        System.out.println("Funcionário: " + nome);
    }
}

