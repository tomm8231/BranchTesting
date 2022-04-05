package com.company;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("MIAV");
  }

  public String getName() {
    return name;
  }
}
