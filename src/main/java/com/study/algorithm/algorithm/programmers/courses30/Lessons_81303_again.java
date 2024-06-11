package com.study.algorithm.algorithm.programmers.courses30;

public class Lessons_81303_again {

  public static void main(String[] args) {

    String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
    String [] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};

    int n = 8;
    int k = 2;

    String solution = solution(n, k, cmd2);

    System.out.println(solution);
  }

  public static String solution(int n, int k, String[] cmd) {


    LinkedListImplements originList = new LinkedListImplements();
    LinkedListImplements changingList = new LinkedListImplements();
    LinkedListImplements deleteList = new LinkedListImplements();

    for(int i = 0; i < n; i++) {
      originList.add(i);
      changingList.add(i);
    }

    changingList.setItem(originList.get(k));

    int point = k;
    for(int i = 0; i < cmd.length; i++) {
      String[] command = cmd[i].split(" ");
      if(command[0].equals("U")) {

        originList.moveUp(Integer.parseInt(command[1]));

      }else if(command[0].equals("D")) {

        originList.moveDown(Integer.parseInt(command[1]));

      }else if(command[0].equals("C")) {
        LinkedListImplements.Node item = changingList.item;
        changingList.remove();
        deleteList.add(item);

      }else if(command[0].equals("Z")) {

      }
    }

    originList.printAll();

    return "";
  }

  public static class LinkedListImplements {
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

    public void add(Object data) {
      Node addItem = new Node(data);
      if(head == null) {
        head = addItem;
        item = addItem;
        tail = item;
      }else {
        item.link = addItem;
        item = addItem;
        tail = item;
      }
    }

    public void add(int idx, Object data) {
      if(idx > size - 1) {
        return;
      }

      Node addItem = new Node(data);
      item = addItem;

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

    public void pop() {
      tail = item.before;
      tail.link = null;
      item = item.before;
      size--;
    }

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

    public Node get(long idx) {

      if(idx > size - 1) {
        return null;
      }

      Node result = head;
      for(int i = 0; i < idx; i++) {
        if( result.link != null) {
          result = result.link;
        }
      }

      return result;
    }

    public void remove() {
      if ( item == head ) {
        head = item.link;
        item = item.link;
      } else if ( item == tail ) {
        tail = item.before;
        item = item.before;
        item.link = null;
      } else {
        item.before.link = item.link;
        item.link.before = item.before;
        item = item.before;
      }
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

    public void setItem(Node item) {
      this.item = item;
    }

    public void moveUp(int count) {
      for(int i = 1; i <= count; i++) {
        if(this.item.before != null) {
          this.item = this.item.before;
        }
      }
    }

    public void moveDown(int count) {
      for(int i = 1; i <= count; i++) {
        if(this.item.link != null) {
          this.item = this.item.link;
        }
      }
    }


  }

}
