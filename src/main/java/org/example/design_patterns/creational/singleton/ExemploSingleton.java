package org.example.design_patterns.creational.singleton;

public class ExemploSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true (mesma instância)
    }
}
