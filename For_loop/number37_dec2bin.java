package For_loop;

public class number37_dec2bin {
    public static void main(String[] args) {
        int n = 23;
        int reminder = 0;
        int num = 0;
        int binary = 0;

        for (int i =0; i <= n; i++) {
            reminder = n % 2;
            // System.out.print(reminder);
            n = n / 2;
            num = num * 10 + reminder; //11101
        }  System.out.println(num);

        for (int i =0; i <= num; i++) {
            binary = num % 10;
            System.out.print(binary);
            num = num / 10;
        }
    }
}
