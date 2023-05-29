package org.example.poo;

public class Cat extends Animal{

    private Boolean isNasty;


    public void meow(){
        System.out.println("meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isNasty=" + isNasty +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
