package com.study.algorithm.algorithm.adt.stack;

public class StackMain {

  public static void main(String[] args) {
    Stack stack = new StackImplements();

    stack.push("스택1");
    stack.push("스택2");
    stack.push("스택3");

    System.out.println(stack.showStackAndClose());
  }
}
