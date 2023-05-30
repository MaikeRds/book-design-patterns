package org.example.annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class ExemploValidacaoIdade {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "123456789", LocalDate.of(1990, 1, 1));
        Usuario usuario2 = new Usuario("Maria", "987654321", LocalDate.of(2005, 6, 10));

        System.out.println("Validação para " + usuario1.getNome() + ": " + validarIdade(usuario1));
        System.out.println("Validação para " + usuario2.getNome() + ": " + validarIdade(usuario2));
    }

    private static <T> boolean validarIdade(T objeto) {
        Class<?> classe = objeto.getClass();
        Field[] campos = classe.getDeclaredFields();
        for (Field campo : campos) {
            if (campo.isAnnotationPresent(IdadeMin.class)) {
                campo.setAccessible(true);
                IdadeMin anotacao = campo.getAnnotation(IdadeMin.class);
                int idadeMinima = anotacao.valor();
                LocalDate dataAtual = LocalDate.now();
                try {
                    LocalDate dataNascimento = (LocalDate) campo.get(objeto);
                    if (dataNascimento.plusYears(idadeMinima).isAfter(dataAtual)) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}
