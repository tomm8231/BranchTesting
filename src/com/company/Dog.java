package com.company;

public class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("WOOF");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

}
