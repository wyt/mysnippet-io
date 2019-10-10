package io.mysnippet.samples.conditional.test;

import io.mysnippet.samples.conditional.config.ConditionalConfig;
import io.mysnippet.samples.conditional.service.Shell;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext();

    annotationConfigApplicationContext.register(ConditionalConfig.class);
    annotationConfigApplicationContext.refresh();

    Shell shell = annotationConfigApplicationContext.getBean(Shell.class);
    System.out.println(shell.listDir());
  }
}
