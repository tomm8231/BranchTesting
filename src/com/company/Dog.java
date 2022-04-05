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

  @Override
  public void showMood(boolean isHappy) {
    if (isHappy) {
      System.out.println("Logrer");
    } else
      System.out.println("Knurrer");
  }
}
