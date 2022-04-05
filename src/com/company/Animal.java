package com.company;

public abstract class Animal {

  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public abstract void showMood(boolean isHappy);

  public abstract boolean eat(String foodType);
}
