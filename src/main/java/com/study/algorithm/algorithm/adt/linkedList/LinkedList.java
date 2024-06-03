package com.study.algorithm.algorithm.adt.linkedList;

public interface LinkedList {
  void add(Object data);
  void add(int idx, Object data);
  void pop();
  void pop(long idx);
  Object get(long idx);
}
