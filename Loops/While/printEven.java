package Loops.While;

//Write a program that will print all the even numbers between 1 to 20.
public class printEven {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
