package org.example.poo;

public class Sushi implements Food{
    @Override
    public void getNutrition() {
        System.out.println("Sushi");
    }

    public void makeSushi(){
        System.out.println("makeSushi");
    }
}
