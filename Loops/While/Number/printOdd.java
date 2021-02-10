package Loops.While.Number;


//Write a program that will print all the odd numbers between 10 to 30.
public class printOdd {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 30) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
