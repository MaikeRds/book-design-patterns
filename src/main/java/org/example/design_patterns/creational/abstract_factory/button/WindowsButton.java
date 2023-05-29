package org.example.design_patterns.creational.abstract_factory.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando um botão no estilo Windows.");
    }
}
