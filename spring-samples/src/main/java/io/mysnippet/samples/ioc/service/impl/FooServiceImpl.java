package io.mysnippet.samples.ioc.service.impl;

import io.mysnippet.samples.ioc.service.FooService;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service
public class FooServiceImpl implements FooService {

  @Override
  public String foo() {
    return "foo";
  }
}
