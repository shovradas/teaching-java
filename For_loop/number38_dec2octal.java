package For_loop;
//Write a program that will convert a given decimal number to octal
public class number38_dec2octal {
    
    public static void main(String[] args) {
        int number;
        int reminder = 0;
        int num = 0;
        int octal = 0;

        for (number = 23; number > 0; number = number / 8) {
            reminder = number % 8;
            // System.out.print(reminder);
            num = num * 10 + reminder; // 11101
        } // System.out.println(num);

        for (; num > 0; num = num / 10) {
            octal = num % 10;
            System.out.print(octal);
        }
    }
}

