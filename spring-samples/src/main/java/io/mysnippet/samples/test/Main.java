package io.mysnippet.samples.test;

import io.mysnippet.samples.config.FooBarConfig;
import io.mysnippet.samples.service.FooBarService;
import io.mysnippet.samples.service.impl.FooBarServiceImpl;
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
        annotationConfigApplicationContext.getBean(FooBarServiceImpl.class);
    String result = fooBarService.foobar();
    System.out.println(result);

    annotationConfigApplicationContext.close();
  }
}
