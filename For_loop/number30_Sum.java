package For_loop;
//Write a program that will compute and print the summation of all the digits of a given N digit number.
public class number30_Sum {
    public static void main(String[] args) {

        int num = 7654321;
        int reminder;
        int rightOrder = 0;
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            reminder = num % 10;
            num = num / 10;
            rightOrder = rightOrder * 10 + reminder;

            if (reminder >= 0) {
                sum=sum+reminder;
            }
        }
        System.out.println(sum);
    }
}
