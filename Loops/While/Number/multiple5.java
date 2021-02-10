package Loops.While.Number;

//Write a program that will print all the numbers between 11 to 57 which are multiple of 5.
public class multiple5 {
    public static void main(String[] args) {
        int i = 11;
        while (i<=57){
            if (i%5==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
