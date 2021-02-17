package For_loop;
//Write a program to find and print the factorial of a given number
public class number22_factorial {
    public static void main(String[] args) {
        int num =8;
        int factorial = 1;
        for(int i =1; i<=num; i ++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
