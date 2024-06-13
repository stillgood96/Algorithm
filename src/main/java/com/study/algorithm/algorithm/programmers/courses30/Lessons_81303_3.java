package com.study.algorithm.algorithm.programmers.courses30;

public class Lessons_81303_3 {

  public static void main(String[] args) {

    String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
    String [] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
    String [] cmd3 = {"D 10","C","U 30","C","D 4","C","U 2","Z","Z","U 1","C"};
    String [] cmd4 = {"C", "D 1", "C", "D 10", "C", "C", "C", "Z", "Z", "Z", "Z", "Z"};

    int n = 8;
    int k = 2;

    String solution = solution(n, k, cmd4);

    System.out.println(solution);
  }

  public static String solution(int n, int k, String[] cmd) {

    StringBuilder origin = new StringBuilder();
    StringBuilder deleted = new StringBuilder();

    for(int i = 0; i < n; i++) {
      origin.append(i);
    }

    int point = k;
    for(int i = 0; i < cmd.length; i++) {
      String[] command = cmd[i].split(" ");
      if ( command[0].equals("D") ) {
        point += Integer.parseInt(command[1]);
        point = point > origin.length() -1 ? origin.length() -1 : point;
      } else if ( command[0].equals("U") ) {
        point -= Integer.parseInt(command[1]);
        point = point < 0 ? 0 : point;
      } else if ( command[0].equals("C") && point >= 0) {

        deleted.append(origin.charAt(point));
        origin.deleteCharAt(point);
        if(point > origin.length() - 1) {
          point--;
        }

      } else if ( command[0].equals("Z") ) {
        char deleteItem = deleted.charAt(deleted.length() - 1);
        deleted.deleteCharAt(deleted.length() - 1);
        if(Character.getNumericValue(deleteItem) > origin.length()) {
         origin.append(deleteItem);
        }else if(Character.getNumericValue(deleteItem) < point) {
          origin.insert(Character.getNumericValue(deleteItem), deleteItem);
          point++;
        }else {
          origin.insert(Character.getNumericValue(deleteItem), deleteItem);
        }
      }
    }

    StringBuffer result = new StringBuffer();
    for(int i = 0; i < n; i++) {
      if(origin.toString().contains(String.valueOf(i))) {
        result.append("O");
      }else{
        result.append("X");
      }
    }
    return result.toString();
  }


}
