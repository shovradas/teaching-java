package For_loop;

import java.util.Scanner;

//Write a program to print the formatted series: 1, 2, 3, 4, 5, 6, …., N
public class number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter last limit n : ");
        int n = scanner.nextInt();
        scanner.close();;
        for (int i=1; i<=n; i++){
            System.out.print(i);
            if (i == n) { 
            }
            else{
                System.out.print(",");
            }
        }
    }
}
