package io.mysnippet.samples.service.impl;

import io.mysnippet.samples.service.FooService;
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
