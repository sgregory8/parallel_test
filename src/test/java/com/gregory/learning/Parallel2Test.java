package com.gregory.learning;

import org.junit.Test;

public class Parallel2Test {

  @Test
  public void waitPlease() {
    try {
      System.out.println("Waiting from: " + this.getClass().getName());
      System.out.println("__________----------THREAD_INFO----------__________");
      System.out.println(Thread.currentThread().getName());
      System.out.println(Thread.currentThread().getId());
      Thread.sleep(10000);
      System.out.println("DONE");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
