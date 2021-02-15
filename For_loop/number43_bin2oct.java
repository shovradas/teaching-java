package For_loop;

//Write a program that will convert a given binary number to octal
public class number43_bin2oct {

    public static void main(String[] args) {
        int i = 1;
        int power = 1;
        int number = 10111;
        int reminder;
        int dec = 0;
        int num = 0;
        int octal = 0;

        for (; number > 0;) {
            reminder = number % 10;
            if (i == 1) { // for 2^0=1 when i is initiating with 1
                power = power * i;
            } else {
                power = power * 2; // from i++ = 2 and onwards power would be 2^i
            }
            dec = dec + (power * reminder);
            number = number / 10;
            i++;
            // System.out.println(dec);
        }
        // System.out.println(dec);

        for (dec = 23; dec > 0; dec = dec / 8) {
            reminder = dec % 8;
            // System.out.print(reminder);
            num = num * 10 + reminder; // 11101
        } // System.out.println(num);

        for (; num > 0; num = num / 10) {
            octal = num % 10;
            System.out.print(octal);
        }
    }
}
