package Loops.While.Number;

public class hex_dec {
    public static void main(String[] args) {
    int n = 17;
        int reminder=10111;
        int reverse = 1;
        int i = 0;
        int count = 0;

        while (n > 0) {
            reminder = n % 10;
            if (i<=n){
                count++;
            }
            reverse = reverse + (16*count*reminder) ;
            //System.out.println(reverse);
            n = n / 10;
        }System.out.println(reverse);
    }
}