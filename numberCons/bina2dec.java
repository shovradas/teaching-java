package numberCons;

public class bina2dec {
    public static void main(String[] args) {
        int n = 10111;
        int temp = n;
        int power = 1;
        int dec = 0;
        int i = 1;
        int j=1;
        int reminder;
        while (i <= n) {
            reminder = n % 10;
            n = n / 10;
            if (j == 1) {
                power = power * i;
                System.out.println(power);
            } else {
                power = power * 2;
                System.out.println(power);
            }

            dec = dec + (reminder * power);
            j++;
        }
        System.out.println(temp + "-" + dec);
    }
}
