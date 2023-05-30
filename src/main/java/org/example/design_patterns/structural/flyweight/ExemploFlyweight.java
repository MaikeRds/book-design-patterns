package org.example.design_patterns.structural.flyweight;

public class ExemploFlyweight {
    public static void main(String[] args) {
        NotaMusical notaDo = NotaMusicalFactory.getNota("Do");
        notaDo.tocar();

        NotaMusical notaRe = NotaMusicalFactory.getNota("Re");
        notaRe.tocar();

        NotaMusical mesmaNotaDo = NotaMusicalFactory.getNota("Do");
        mesmaNotaDo.tocar();
    }
}
