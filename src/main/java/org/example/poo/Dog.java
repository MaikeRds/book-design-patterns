package org.example.poo;

public class Dog extends Animal {

    private Object bestFriend;

    public void bark(){
        System.out.println("bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bestFriend=" + bestFriend +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}