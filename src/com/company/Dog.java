package com.company;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("WOOF");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }


  public String getName() {
    return name;
  }
}
