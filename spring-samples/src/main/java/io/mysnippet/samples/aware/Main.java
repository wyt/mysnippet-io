package io.mysnippet.samples.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext(FoobarConfig.class);

    FoobarAware foobarAware = annotationConfigApplicationContext.getBean(FoobarAware.class);

    System.out.println(foobarAware.getBeanName());

    annotationConfigApplicationContext.close();
  }
}
