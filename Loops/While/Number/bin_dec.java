package Loops.While.Number;

public class bin_dec {
    public static void main(String[] args) {
        int n = 10111;
        int reminder=0;
        int reverse = 1;
        int i = 0;
        int count = 0;
        int test = 0;

        while (n > 0) {
            reminder = n % 10;
            if (i<=n){
                count++;
            }
            reverse = reverse + (2*count*reminder) ;
            //System.out.println(reverse);
            n = n / 10;
        }System.out.println(reverse);
        // test = 2^2*1;
        // System.out.println(test);
    }
}