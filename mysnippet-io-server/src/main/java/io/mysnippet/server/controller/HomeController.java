package io.mysnippet.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomePage.
 *
 * @author wangyongtao
 * @date 2019-8-5
 */
@RestController
public class HomeController {

  @RequestMapping(
      value = "/",
      method = {RequestMethod.GET, RequestMethod.POST})
  String home() {
    return "Hello, mysnippet-io!";
  }
}
