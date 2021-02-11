package Loops.While.Number;

import java.util.Scanner;

public class newConstruct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, d;
    n = sc.nextInt();
    int num = 0;

    int reverse = 0;
    while (n-- != 0) {
      d = sc.nextInt();
      num = num * 10 + d;
    }
    // System.out.println(num); //123
    // int temp = num;
    // System.out.println(temp); //123

    while (num > 0) {
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;
    }
    System.out.println(reverse);
  }
}