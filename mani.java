package core;

import java.util.Scanner;

public class mani {

  public static void main(String[] args) {
    int num;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter Name: ");
    String name = s.nextLine();
    int name_len = name.length();

    System.out.println("-1-first style -2-second style -3-third style");
    System.out.println("Enter Option: ");
    num = s.nextInt();

    if (num == 1) {
      for (int i = name.length() + 0; i >= 0; i--) {
        for (int j = 0; j < name.length(); j++) {
          if (j <= i) {
            System.out.print(name.charAt(j));
          } else {
            System.out.print("*");
          }
        }
        System.out.println();
      }

    } else if (num == 2) {
      for (int i = 0; i < name_len; i++) {
        for (int j = 0; j < name_len; j++) {
          if (i == j || (i - j) == name_len + 1) {
            System.out.print(name.charAt(i));
          } else {
            System.out.print("*");
          }
        }
        System.out.println();
      }
    } else {
      for (int i = 0; i < name_len; i++) {
        for (int j = 0; j < name_len; j++) {
          if (j == 3 && i < 3) {
            System.out.print(name.charAt(i) + " ");
          } else if (i == 2) {
            System.out.print(name.charAt(j) + " ");
          } else if (j == 3 && i > 2) {
            System.out.print(name.charAt(i) + " ");
          } else {
            System.out.print("*");
          }
        }
        System.out.println();
      }
    }

  }
}
