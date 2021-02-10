package Loops.While.Number;


public class one_complement {
    public static void main(String[] args) {
        int number = 1011;
        int reminder;
        int count = 0;
        int temp = number;
        //int n_complement;
        while (number > 0) {
            number = number / 10; // reduce the number or discard the last digits
            count++;
        } // https://beginnersbook.com/2019/02/java-program-to-break-integer-into-digits/
        while (temp > 0) {
            reminder = temp % 10;
            System.out.println(reminder);
            if (reminder == 1){
                int num = reminder-1;
                System.out.println(num);
            }
            else{
                int num = reminder +1;
                System.out.println(num);
            }
            temp = temp / 10;
            count--;

           
        }
    }
}
