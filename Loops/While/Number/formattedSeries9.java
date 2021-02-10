package Loops.While.Number;

//Write a program to print the formatted Series: 11, 22, 33, 44, 55, 66, …., NN
public class formattedSeries9 {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        int l = 10;

        while (i <= l){
            n= n+11;
            System.out.println(n);
            i++;
        }
    }
}
