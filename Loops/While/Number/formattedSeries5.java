package Loops.While.Number;
//1,10,100,....,N
import java.util.Scanner;
public class formattedSeries5{
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        while (i<=7){
            n = n*10;
            System.out.println(n);
            i++;
        }
    }
}
