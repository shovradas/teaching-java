package For_loop;
//Write a program to print the formatted Series: 1, 3, 33, 333, 3333, …., N
public class number47 {
    public static void main(String[] args) {
        int i;
        int seriesFirstDigit = 3;
        int limit = 7;

        for (i = 0; i <= limit ;i++) {
            System.out.print(seriesFirstDigit + " + ");
            seriesFirstDigit = (seriesFirstDigit * 10) + 3;
        }
    }
}
