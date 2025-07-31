package com.linkedbear.spring.my_test.bean_life_single_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean , DisposableBean {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println("person set name: " + name);
  }

  public Person() {
    System.out.println("person构造方法");
  }

  @PostConstruct
  public void init() {
    System.out.println("persson init方法");
  }

  @PreDestroy
  public void end() {
    System.out.println("person end方法");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("person afterPropertiesSet方法");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("person destroy方法");
  }
}
