package For_loop;

//Write a program that will count all the factors of a given number.
public class number24_factors {
    public static void main(String[] args) {
        int num = 60;
        int count = 0;
        for (int i = 1; i <= 60; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
