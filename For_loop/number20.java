package For_loop;

// Write a program that will find and print the summation of all the odd numbers between 10 to 50.
public class number20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 50; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
