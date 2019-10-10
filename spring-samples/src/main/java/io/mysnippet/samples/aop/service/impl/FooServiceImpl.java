package io.mysnippet.samples.aop.service.impl;

import io.mysnippet.samples.aop.service.FooService;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service("fooServiceImpl")
public class FooServiceImpl implements FooService {

  @Override
  public String foo() {
    return "foo";
  }
}
