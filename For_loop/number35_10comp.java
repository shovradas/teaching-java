package For_loop;

public class number35_10comp {
    public static void main(String[] args) {
        int num = 1234;
        int reminder;
        int nine_comp_num = 0;
        int new_num = 0;
        int nine_comp;
        int rem;
        for (int i = 0; i <= num; i++) {
            reminder = num % 10;
            num = num / 10;
            nine_comp = 9 - reminder;
            nine_comp_num = nine_comp_num * 10 + nine_comp;
        }
        //System.out.println(nine_comp_num);

        for (int i = 0; i <= nine_comp_num; i++) {
            rem = nine_comp_num % 10;
            nine_comp_num = nine_comp_num / 10;
            new_num = new_num * 10 + rem;
        }
        System.out.println(new_num+1);
    }
}
