package For_loop;

//Write a program to find if a given number is palindromic or not.
public class number33_palindromic {
    public static void main(String[] args) {
        int num = 9119;
        int temp = num;
        int reminder;
        int mirror_num = 0;
        for (int i = 0; i <= num; i++) {
            reminder = num % 10;
            num = num / 10;
            mirror_num = mirror_num * 10 + reminder;
        }
        // System.out.println(temp);
        // System.out.println(mirror_num);

        if (mirror_num == temp) {
            System.out.println("is a palindromic number");
        } else {
            System.out.println("is not a palindromic number");
        }

    }
}
