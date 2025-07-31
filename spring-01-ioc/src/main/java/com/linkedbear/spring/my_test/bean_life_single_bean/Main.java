package com.linkedbear.spring.my_test.bean_life_single_bean;

import com.linkedbear.spring.my_test.bean_life_single_bean.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    System.out.println("准备初始化IOC容器。。。");
    AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(
        BeanConfig.class);
    System.out.println("容器初始化完毕");
    System.out.println();
    System.out.println("准备销毁容器");
    application.close();
    System.out.println("容器销毁完毕");
  }
}
