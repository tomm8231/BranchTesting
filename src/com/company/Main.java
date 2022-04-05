package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bjarne");
        Cat cat1 = new Cat("Misser");

        System.out.println(dog1.name);
        dog1.makeSound();
        dog1.eat("steak");

        System.out.println(cat1.name);
        cat1.makeSound();
        cat1.eat("fish");
    }
}
