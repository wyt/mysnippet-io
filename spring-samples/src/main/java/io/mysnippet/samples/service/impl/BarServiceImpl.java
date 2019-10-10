package io.mysnippet.samples.service.impl;

import io.mysnippet.samples.service.BarService;
import io.mysnippet.samples.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service
public class BarServiceImpl implements BarService {

  @Autowired private FooService fooService;

  @Override
  public String bar() {
    return "bar";
  }
}
