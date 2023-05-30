package org.example.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotaMusicalFactory {
    private static Map<String, NotaMusical> notas = new HashMap<>();

    public static NotaMusical getNota(String nota) {
        NotaMusical notaMusical = notas.get(nota);

        if (notaMusical == null) {
            notaMusical = new NotaMusicalImpl(nota);
            notas.put(nota, notaMusical);
        }

        return notaMusical;
    }
}
