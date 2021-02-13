package For_loop;

//Write a program that will compute and print the sum of all the factors of a given number.
public class number25Sum_of_Factors {
    public static void main(String[] args) {
        int num = 60;
        int sum = 0;
        for (int i = 1; i <= 60; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
