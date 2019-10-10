package io.mysnippet.samples.conditional.service.impl;

import io.mysnippet.samples.conditional.service.Shell;

public class LinuxShellImpl implements Shell {

  @Override
  public String listDir() {
    return "ls -lh";
  }
}
