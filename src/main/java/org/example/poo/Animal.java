package org.example.poo;

public class Animal {

    public String name;
    public String sex;
    public Integer age;
    public Integer weight;
    public String color;

    public void breathe(){
        System.out.println("breathe");
    }

    public void eat(Food food){
        System.out.println("eat");
        food.getNutrition();
    }

    public void run(String destination){
        System.out.println("destination");
    }

    public void sleep(String hours){
        System.out.println("sleep");
    }
}
