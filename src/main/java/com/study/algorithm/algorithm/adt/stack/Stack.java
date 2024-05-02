package com.study.algorithm.algorithm.adt.stack;

public interface Stack {
  void pop();
  void push(Object data);
  boolean isEmpty();

  Object peek();
  String showStackAndClose();
}
