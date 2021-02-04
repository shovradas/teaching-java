package Method;

import java.util.Scanner;

class programMethod{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        find(num);
    }

    public static void find(int num){
        if (num%2==0){
            System.out.println(num +" is even");
        }
        else
        System.out.println(num +" is odd");
    }   
}