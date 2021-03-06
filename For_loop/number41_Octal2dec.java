package For_loop;

//Write a program that will convert a given octal number to decimal
public class number41_Octal2dec {
    public static void main(String[] args) {

        int i = 1;
        int power = 1;
        int number = 27;
        int reminder;
        int dec = 0;

        for (; number > 0;) {
            reminder = number % 10;
            if (i == 1) { // for 2^0=1 when i is initiating with 1
                power = power * i;
            } else {
                power = power * 8; // from i++ = 2 and onwards power would be 2^i
            }
            dec = dec + (power * reminder);
            number = number / 10;
            i++;
            // System.out.println(dec);
        }
        System.out.println(dec);
    }
}
