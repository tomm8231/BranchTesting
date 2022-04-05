package com.company;

public class Cat extends Animal {


  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("MIAV");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public void showMood(boolean isHappy) {
    if (isHappy) {
      System.out.println("Spinder");
    } else
    System.out.println("Hvæser");
  }
}
