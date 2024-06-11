package com.study.algorithm.algorithm.programmers.courses30;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lessons_81303 {

  public static void main(String[] args) {

    String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
    String [] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};

    int n = 8;
    int k = 2;

    String solution = solution(n, k, cmd2);

    System.out.println(solution);
  }

  public static String solution(int n, int k, String[] cmd) {

    LinkedList<Integer> originList = new LinkedList<>();
    LinkedList<Integer> compareList = new LinkedList<>();
    LinkedList<Integer> deletedList = new LinkedList<>();

    for(int i = 0; i < n; i++) {
      originList.add(i);
      compareList.add(i);
    }

    int point = k;

    for(int i = 0; i < cmd.length; i++) {
      String[] command = cmd[i].split(" ");

      if( command[0].equals("U") ) {
        point =
            point - Integer.parseInt(command[1]) >= 0 ?
                point - Integer.parseInt(command[1]) : 0;


      }else if( command[0].equals("D") ) {

        point =
            point + Integer.parseInt(command[1]) > compareList.size() - 1 ?
                compareList.size() - 1 : point + Integer.parseInt(command[1]);

      }else if( command[0].equals("C") ) {

        deletedList.add(compareList.get(point));
        compareList.remove(point);

      }else if( command[0].equals("Z") ) {
//
//        Integer pop = deletedList.get(deletedList.size() -1);
//        deletedList.remove(deletedList.size() - 1);
//        try {
//          compareList.add(pop, pop);
//        }catch ( IndexOutOfBoundsException e ) {
//          compareList.add(pop);
//        }
      }
    }

    String answer = "";
    System.out.println(originList);
    System.out.println(compareList);


    for(int i = 0; i < originList.size(); i++) {
      String addAnswer = "X";
      for(int j = 0; j < compareList.size(); j++) {
        if(compareList.get(j).equals(originList.get(i))) {
          addAnswer = "O";
        }
      }

      answer += addAnswer;
    }

    return answer;
  }

}
