package io.mysnippet.samples.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext(FoobarConfig.class);

    FoobarPub foobarPub = annotationConfigApplicationContext.getBean(FoobarPub.class);

    foobarPub.publish("this is a event msg.");

    annotationConfigApplicationContext.close();
  }
}
