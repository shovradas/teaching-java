package For_loop;
//Write a program that will count the number of digits in a given number.
public class number29_Count {
    public static void main(String[] args) {

        int num = 7654321;
        int reminder;
        int rightOrder = 0;
        int count = 0;
        for (int i = 0; i <= num; i++) {
            reminder = num % 10;
            num = num / 10;
            rightOrder = rightOrder * 10 + reminder;

            if (reminder >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}