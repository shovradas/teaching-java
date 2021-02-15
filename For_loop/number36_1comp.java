package For_loop;
//Write a program to find the 1’s Complement of a given binary number
public class number36_1comp {
    public static void main(String[] args) {
        int number; 
        int reminder = 0;
        int one_complement = 0;
        int reverse = 0;
        int digit;
        
        for (number = 1101; number>0; number=number/10) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
        }
         //System.out.print(reverse);
        for (; reverse>0; reverse=reverse/10) {
            reminder = reverse % 10;
            one_complement = 1 - reminder;
            System.out.print(one_complement);
        }

    }
}

