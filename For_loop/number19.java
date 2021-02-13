package For_loop;

//Write a program that will find and print the summation of all the numbers between 1 to 20.
public class number19 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + i;     
        }
        System.out.println(sum);
    }
}