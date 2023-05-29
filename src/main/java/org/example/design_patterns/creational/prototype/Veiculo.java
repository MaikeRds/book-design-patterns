package org.example.design_patterns.creational.prototype;

import java.util.Objects;

public class Veiculo implements ClonePrototype {

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Veiculo clonar() {
        return new Veiculo(this.marca, this.modelo);
    }

}
