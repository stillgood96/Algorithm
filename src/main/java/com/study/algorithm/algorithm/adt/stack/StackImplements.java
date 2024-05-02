package com.study.algorithm.algorithm.adt.stack;

public class StackImplements implements Stack {
  Node item;
  private class Node {
    Object data;
    Node before;

    public Node(Object data, Node before) {
      this.data = data;
      this.before = before;
    }
  }

  @Override
  public void pop() {
    if(!isEmpty()) {
      System.out.println(item.data);
      item = item.before;
    }
  }

  @Override
  public void push(Object data) {
    item = new Node(data, item);
  }

  @Override
  public boolean isEmpty() {
    return item == null;
  }

  @Override
  public Object peek() {
    return item.data;
  }

  @Override
  public String showStackAndClose() {
    StringBuffer sb = new StringBuffer();
    while(!isEmpty() && item.before != null) {
      sb.append(item.data.toString() + "\n");
      item = item.before;
    }

    return sb.toString();
  }
}
