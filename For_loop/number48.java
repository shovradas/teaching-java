package For_loop;
//Write a program to print the formatted Series: 9, 99, 999, 9999, …., N
public class number48 {
    public static void main(String[] args) {
        int i = 0;
        int seriesFirstDigit = 9;
        int limit = 10;

        while (i <= limit) {
            System.out.print(seriesFirstDigit + " + ");
            seriesFirstDigit = (seriesFirstDigit * 10) + 9;
            i++;
        }
    }
}

