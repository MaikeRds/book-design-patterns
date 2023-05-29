package org.example.design_patterns.creational.abstract_factory.button;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando um botão no estilo macOS.");
    }
}
