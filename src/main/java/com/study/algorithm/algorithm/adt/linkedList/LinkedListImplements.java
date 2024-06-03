package com.study.algorithm.algorithm.adt.linkedList;

public class LinkedListImplements implements LinkedList {
  Node head;
  Node item;
  Node tail;
  int size = 0;
  private class Node {
    Object data;
    Node link;
    Node before;
    public Node(Object data) {
      this.data = data;
      this.link = null;
      this.before = item;
      size++;
    }
  }

  @Override
  public void add(Object data) {
    Node addItem = new Node(data);
    if(head == null) {
      head = addItem;
      item = addItem;
    }else {
      item.link = addItem;
      item = addItem;
      tail = item;
    }
  }

  @Override
  public void add(int idx, Object data) {
    if(idx > size - 1) {
      return;
    }

    Node addItem = new Node(data);

    Node itemToAdd = head;
    for(int i = 0; i < idx; i++) {
      if( itemToAdd.link != null) {
        itemToAdd = itemToAdd.link;
      }
    }

    if(itemToAdd == head) {
      addItem.link = itemToAdd;
      addItem.before = null;
      itemToAdd.before = addItem;
      head = addItem;

    }else {
      addItem.link = itemToAdd;
      addItem.before = itemToAdd.before;
      itemToAdd.before.link = addItem;
      itemToAdd.before = addItem;
    }
  }

  @Override
  public void pop() {
    tail = item.before;
    tail.link = null;
    item = item.before;
    size--;
  }

  @Override
  public void pop(long idx) {
    if(idx > size - 1) {
      return;
    }

    Node itemToPop = head;
    for(int i = 0; i < idx; i++) {
      if( itemToPop.link != null) {
        itemToPop = itemToPop.link;
      }
    }

    if(itemToPop == head) {
      head = itemToPop.link;
      head.before = null;
    }else if(itemToPop == tail) {
      tail = itemToPop.before;
      tail.link = null;
    }else {
      itemToPop.before.link = itemToPop.link;
      itemToPop.link.before = itemToPop.before;
    }

    size--;
  }

  @Override
  public Object get(long idx) {

    if(idx > size - 1) {
      return null;
    }

    Node result = head;
    for(int i = 0; i < idx; i++) {
      if( result.link != null) {
        result = result.link;
      }
    }

    return result.data;
  }

  public void printAll() {
    Node result = head;
    System.out.println("===============printAll Start====================");
    while(result != null) {
      System.out.println(result.data);
      result = result.link;
    }
    System.out.println("===============printAll End====================");
  }
}

