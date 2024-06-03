package com.study.algorithm.algorithm.adt.linkedList;

public class LinkedListMain {

  public static void main(String[] args) {
    LinkedListImplements linkedList = new LinkedListImplements();

    linkedList.add("0");
    linkedList.add("1");
    linkedList.add("2");
    linkedList.add("3");
    linkedList.add("4");
    linkedList.add("5");
    linkedList.add("6");

    linkedList.printAll(); // 0~6

    linkedList.pop();
    linkedList.pop();
    linkedList.pop();

    linkedList.printAll(); // 0~3

    linkedList.add("4");
    linkedList.add("5");
    linkedList.add("6");

    linkedList.printAll(); // 0~6

    linkedList.add(0, "9");
    linkedList.printAll(); //9,0,1,2,3,4,5,6

    linkedList.add(1, "1");
    linkedList.printAll(); //9,1,0,1,2,3,4,5,6

    linkedList.add(8, "10");
    linkedList.printAll(); //9,1,0,1,2,3,4,5,10,6

    linkedList.pop(8);
    linkedList.printAll(); //9,1,0,1,2,3,4,5,6

    linkedList.pop(8);
    linkedList.printAll(); //9,1,0,1,2,3,4,5

    linkedList.pop(0);
    linkedList.printAll(); //1,0,1,2,3,4,5

  }
}
