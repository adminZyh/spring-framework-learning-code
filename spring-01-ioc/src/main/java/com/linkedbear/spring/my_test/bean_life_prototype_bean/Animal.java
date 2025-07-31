package com.linkedbear.spring.my_test.bean_life_prototype_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean, DisposableBean {
  public Animal() {
    System.out.println("animal 构造方法");
  }

  @PostConstruct
  public void init() {
    System.out.println("animal init方法");
  }

  @PreDestroy
  public void end() {
    System.out.println("animal end方法");
  }


  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("animal afterPropertiesSet");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("animal destroy");
  }
}
