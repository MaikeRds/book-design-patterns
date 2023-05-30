package org.example.design_patterns.structural.flyweight;

public class NotaMusicalImpl implements NotaMusical {
    private String nota;

    public NotaMusicalImpl(String nota) {
        this.nota = nota;
    }

    public void tocar() {
        System.out.println("Tocando nota " + nota);
    }
}