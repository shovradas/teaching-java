package For_loop;
//Write a program to find the 1’s Complement of a given binary number
public class number36_1comp {
    public static void main(String[] args) {
        int number = 1101;
        int reminder = 0;
        int count = 0;
        int one_complement = 0;
        int reverse = 0;

        for (int i=0; 1<= number; i++) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
         //System.out.print(reverse);
        for (int i=0; 1<= reverse; i++) {
            reminder = reverse % 10;
            one_complement = 1 - reminder;
            System.out.print(one_complement);
            reverse = reverse / 10;
            count--;
        }

    }
}

