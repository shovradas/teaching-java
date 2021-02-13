package For_loop;
//Write a program that will count the number of digits in a given number.
public class number28_SeperateDigit {
    public static void main(String[] args) {
        int num = 7654321;
        int reminder;
        int rightOrder = 0;
        int rem;
        for (int i = 0; i<=num; i++){
            reminder = num%10;
            num= num/10;
        //System.out.println(reminder);
        rightOrder = rightOrder*10+reminder;
        }

        for(int i = 0; i<=rightOrder; i++){
            rem = rightOrder%10;
            System.out.println(rem);
            rightOrder=rightOrder/10;
        }
    }
}
