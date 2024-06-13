package com.study.algorithm.algorithm.programmers.courses30;

public class Lessons_81303_2 {

  public static void main(String[] args) {

    String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
    String [] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
    String [] cmd3 = {"D 10","C","U 30","C","D 4","C","U 2","Z","Z","U 1","C"};

    int n = 8;
    int k = 2;

    String solution = solution(n, k, cmd);

    System.out.println(solution);
  }

  public static String solution(int n, int k, String[] cmd) {


    LinkedListImplements originList = new LinkedListImplements();
    LinkedListImplements deleteList = new LinkedListImplements();

    for(int i = 0; i < n; i++) {
      originList.add(i);
    }
    originList.setItem(originList.get(k));

    for(int i = 0; i < cmd.length; i++) {
      String[] command = cmd[i].split(" ");

      if(command[0].equals("U")) {
        originList.moveUp(Integer.parseInt(command[1]));

      }else if(command[0].equals("D")) {
        originList.moveDown(Integer.parseInt(command[1]));

      }else if(command[0].equals("C")) {
        deleteList.add(originList.pop());

      }else if(command[0].equals("Z")) {
        LinkedListImplements.Node recoveryNode = deleteList.popTail();
        originList.revert(recoveryNode);
      }

      originList.printAll();

    }

    return originList.answer();
  }

  public static class LinkedListImplements {
    Node head;
    Node item;
    Node tail;

    private class Node {
      int data;
      Node link;
      Node before;

      boolean removed;

      public Node(int data) {
        this.data = data;
        this.link = null;
        this.before = item;
        this.removed = false;
      }
    }

    public void add(int data) {
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
    public int pop() {
      Node popedItem = item;
      popedItem.removed = true;
      item = popedItem.link != null ? popedItem.link : item.before;
      return popedItem.data;
    }

    public Node popTail() {
      Node popedTail = tail;
      popedTail.removed = true;
      tail = tail.before;
      tail.link = null;
      return popedTail;
    }

    public Node get(long idx) {

      Node result = head;
      for(int i = 0; i < idx; i++) {
        if( result.link != null) {
          result = result.link;
        }
      }

      return result;
    }

    public void moveUp(int count) {
      for(int i = 1; i <= count; i++) {
        if(item.before != null) {
          item = item.before;
          while(item != null && item.removed && item.before != null) {
            item = item.before;
          }
        }
      }
    }

    public void moveDown(int count) {

      for(int i = 1; i <= count; i++) {
        if(item.link != null) {
          item = item.link;
          while(item != null && item.removed && item.link != null) {
            item = item.link;
          }
        }
      }
    }

    public void setItem(Node item) {
      this.item = item;
    }

    public void revert(Node revertItem) {
      Node findNode = head;

      while(findNode != null) {
        if(findNode.data == revertItem.data ) {

          findNode.removed = false;
          break;
        }else {
          findNode = findNode.link;
        }
      }
    }

    public void printAll() {
      Node result = head;
      System.out.println("===============printAll Start====================");
      while(result != null) {
        if(!result.removed) {
          System.out.println(result.data);
        }
        result = result.link;
      }
      System.out.println("===============printAll End====================");
    }

    public String answer() {
      StringBuffer sb = new StringBuffer();

      Node result = head;
      while(result != null) {
        if(!result.removed) {
          sb.append("O");
        }else {
          sb.append("X");
        }
        result = result.link;
      }

      return sb.toString();
    }
  }

}
