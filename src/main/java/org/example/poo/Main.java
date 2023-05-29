package org.example.poo;
/*
        Básico da POO

        A Programação Orienteda à Objetos (POO) é um paradigma ba-
        seado no conceito de envolver pedaços de dados, e comporta-
        mentos relacionados aqueles dados, em uma coleção chamada

        objetos, que são construídos de um conjunto de “planos de

        construção”, definidos por um programador, chamados de clas-
        ses.

        Hierarquias de classe

*/

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = List.of(new Animal(), new Dog(), new Cat());

        Dog dog = new Dog();
        dog.name = "Cachorro";
        dog.eat(new Sushi());

        Cat cat = new Cat();
        cat.name = "Gato";
        cat.eat(new Sausage());

        Animal cachorro = new Dog();

        Food shushi = new Sushi();
        shushi.getNutrition();

        Sushi shushi2 = new Sushi();

        System.out.println(dog);
        System.out.println(cat);
    }
}
