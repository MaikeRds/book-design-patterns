package org.example.design_patterns.creational.abstract_factory.checkbox;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Renderizando uma caixa de seleção no estilo macOS.");
    }
}
