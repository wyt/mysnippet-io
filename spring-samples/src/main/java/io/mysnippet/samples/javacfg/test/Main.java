package io.mysnippet.samples.javacfg.test;

import io.mysnippet.samples.javacfg.config.FooBarConfig;
import io.mysnippet.samples.javacfg.service.FooBarService;
import io.mysnippet.samples.javacfg.service.impl.FooBarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext(FooBarConfig.class);

    FooBarService fooBarService =
        annotationConfigApplicationContext.getBean(FooBarService.class);
    String result = fooBarService.foobar();
    System.out.println(result);

    for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
      System.out.println(name);
    }

    annotationConfigApplicationContext.close();
  }
}
