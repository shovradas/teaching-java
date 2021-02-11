package Loops.While.Number;

//Write a program that will find and print the mirror number of a given number.
public class mirrorNum {
    int i = 1;

    public static void main(String[] args) {
        int num = 1101, mirror_Num = 0;
        while (num > 0) {
            int digit = num % 10;
            mirror_Num = mirror_Num * 10 + digit;
            num = num / 10;
        }
        System.out.println("Mirror Number: " + mirror_Num);
    }
}
