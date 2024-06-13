package com.study.algorithm.algorithm.programmers.courses30;

public class Lessons_81303_5 {

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

   StringBuilder removed = new StringBuilder();
   int size = n;
   for(int i = 0; i < cmd.length; i++) {
     String[] command = cmd[i].split(" ");

     if(command[0].equals("D")) {
       k += Integer.parseInt(command[1]);
     }else if(command[0].equals("U")) {
       k -= Integer.parseInt(command[1]);
     }else if(command[0].equals("C")) {

     }


   }



   return null;
  }


}
