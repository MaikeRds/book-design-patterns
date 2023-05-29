package org.example.design_patterns.creational.singleton;

public class Singleton {
    // Instância privada única do Singleton
    private static Singleton instancia;

    // Construtor privado para evitar criação direta de instâncias
    private Singleton() {
        // Inicialização de recursos ou configurações
    }

    // Método estático para obter a instância única do Singleton
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
