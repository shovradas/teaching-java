package Loops.While.Number;

public class oct2dec {
    public static void main(String[] args) {
        int i = 1;
        int power = 1;
        int n = 27;
        int reminder;
        int dec = 0;
        int rem;
        int num_num = 0;
        int digit;
        int binary = 0;

        while (n > 0) {
            reminder = n % 10;
            if (i == 1) {
                power = power * i;
            } else {
                power = power * 8;
            }
            dec = dec + (power * reminder);
            n = n / 10;
            i++;
        }
        System.out.println(dec);

        while(dec>0){
            rem = dec%2;
            dec=dec/2;
            num_num=num_num*10+rem;
            
        }System.out.println(num_num);

        while(num_num>0){
            digit=num_num%10;
            num_num = num_num/10;
            binary = binary*10+digit;
        }System.out.println(binary);
    }
}
