package For_loop;

public class number35_10comp {
    public static void main(String[] args) {
        int num = 7654321;
        int reminder;
        int nine_comp_num = 0;
        int nine_comp = 0;
        int new_num = 0;
        int rem;
        int i = 0;
        // while ( num>0) {
        for (i = 0; i <= num; i++) {
            reminder = num % 10;
            num = num / 10;
            nine_comp_num = 9 - reminder;
            // System.out.print(nine_comp_num);
            nine_comp = nine_comp * 10 + nine_comp_num;
        }
        for (int j = 0; j <= nine_comp; j++) {
            rem = nine_comp % 10;
            nine_comp = nine_comp / 10;
            new_num = new_num * 10 + rem;
        }
        System.out.println(new_num + 1);

    }
}
