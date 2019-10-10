package io.mysnippet.samples.conditional.service.impl;

import io.mysnippet.samples.conditional.service.Shell;

public class WindowsShellImpl implements Shell {

  @Override
  public String listDir() {
    return "dir /D";
  }
}
