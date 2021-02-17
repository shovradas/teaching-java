package For_loop;
//Write a program that will find and print the mirror number of a given number.
public class number32_mirror {
    public static void main(String[] args) {
        int num = 7654321;
        int reminder;
        int mirror_num = 0;
        for (; num > 0; num = num / 10) {
            reminder = num % 10;
            mirror_num = mirror_num * 10 + reminder;
        }
        System.out.println(mirror_num);
    }
}
