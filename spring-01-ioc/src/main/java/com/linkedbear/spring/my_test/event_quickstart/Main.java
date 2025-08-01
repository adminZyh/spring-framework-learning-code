package com.linkedbear.spring.my_test.event_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    System.out.println("初始化容器");
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.linkedbear.spring.my_test.event_quickstart");
    System.out.println("容器初始化完成");
    applicationContext.close();
    System.out.println("IOC容器关闭");
  }
}
