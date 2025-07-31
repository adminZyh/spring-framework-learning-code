package com.linkedbear.spring.my_test.bean_life_prototype_bean;

import com.linkedbear.spring.annotation.a_quickstart.AnnotationConfigApplication;
import com.linkedbear.spring.my_test.bean_life_prototype_bean.config.AnimalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

//  public static void main(String[] args) {
//    System.out.println("ioc容器开始启动");
//    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
//        AnimalConfig.class);
//    System.out.println("Ioc容器启动完毕");
//    System.out.println();
//
//    System.out.println("ioc容器开始销毁");
//    applicationContext.close();
//    System.out.println("ioc容器销毁完毕");
//  }

  public static void main(String[] args) {
    System.out.println("ioc容器开始启动");
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        AnimalConfig.class);
    System.out.println("ioc容器开始启动完毕");
    System.out.println("开始获取animal");
    Animal animal = applicationContext.getBean(Animal.class);
    System.out.println("获取到animal:"+animal);
  }
}
