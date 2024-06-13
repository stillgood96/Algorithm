package com.study.algorithm.algorithm.programmers.courses30;

public class Lessons_81303_4 {

  public static void main(String[] args) {

    String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
    String [] cmd2 = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
    String [] cmd3 = {"D 10","C","U 30","C","D 4","C","U 2","Z","Z","U 1","C"};
    String [] cmd4 = {"D 10","C", "U 10", "C", "D 10", "C", "Z", "Z", "Z","Z"};

    int n = 8;
    int k = 2;

    String solution = solution(n, k, cmd2);

    System.out.println(solution);
  }

  public static String solution(int n, int k, String[] cmd) {

    StringBuilder origin = new StringBuilder();
    StringBuilder deleted = new StringBuilder();


    for(int i = 0; i < n; i++) {
      origin.append("O");
    }

    for(int i = 0; i < cmd.length; i++) {
      String[] command = cmd[i].split(" ");

      if(command[0].equals("D")) {

        int count = Integer.parseInt(command[1]);

        while(count != 0) {
          count--;
          k++;
          if(origin.charAt(k) == 'X') {
            count++;
          }
        }
        k = k > origin.length() -1 ? origin.length() - 1 : k;
      }else if(command[0].equals("U")) {

        int count = Integer.parseInt(command[1]);

        while(count != 0) {
          count--;
          k--;
          if(origin.charAt(k) == 'X') {
            count++;
          }
        }
        k = k < 0 ? 0 : k;

      }else if(command[0].equals("C")) {
        origin.setCharAt(k, 'X');
        deleted.append(k);
      }else if(command[0].equals("Z")) {
        char recoveryChar = deleted.charAt(deleted.length() - 1);
        deleted.deleteCharAt(deleted.length() - 1);
        origin.setCharAt(Character.getNumericValue(recoveryChar), 'O');
      }
    }

    return origin.toString();
  }


}
