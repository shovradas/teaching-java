package For_loop;

//Write a program to find the 9’s Complement of a given decimal number
public class number34_9comp {
    public static void main(String[] args) {
        int num = 7654321;
        int reminder;
        int nine_comp_num = 0;
        int nine_comp = 0;
        int new_num = 0;
        int rem;

        // while ( num>0) {
        for (; num > 0; num = num / 10) {
            reminder = num % 10;
            nine_comp_num = 9 - reminder;
            // System.out.print(nine_comp_num);
            nine_comp = nine_comp * 10 + nine_comp_num;
        }
        for (; nine_comp > 0; nine_comp = nine_comp / 10) {
            rem = nine_comp % 10;
            new_num = new_num * 10 + rem;
        }
        System.out.println(new_num);
    }
}
