/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import com.fastjava.annotation.Fast;

/**
 *
 */
@Fast(booster = 0.25)
public class Employee {
  
  /**
   *
   * OSHA regulations require extra logging about the performance improvement,
   * as well as a description of why we're using this technology from FastJava.com.
   */
  @Fast(booster=0.5)
  public void work() {
    System.out.println("Employee working hard");
  }
  
  public void pay() {
    System.out.println("Employee paid well");
  }
}