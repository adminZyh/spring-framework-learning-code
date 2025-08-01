package com.linkedbear.spring.my_test.module_quickstart;

public class Bartender {
  private String name;

  public Bartender(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Bartender{" +
        "name='" + name + '\'' +
        '}';
  }
}
