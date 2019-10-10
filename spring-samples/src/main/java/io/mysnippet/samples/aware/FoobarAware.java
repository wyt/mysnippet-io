package io.mysnippet.samples.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class FoobarAware implements BeanNameAware {

  private String name;

  @Override
  public void setBeanName(String name) {
    this.name = name;
  }

  public String getBeanName() {
    return name;
  }
}
