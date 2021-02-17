package For_loop;
//Write a program to print the formatted Series: 9, 99, 999, 9999, …., N
public class number48 {
    public static void main(String[] args) {
        int seriesFirstDigit = 9;
        int limit = 5;

        for (int i = 0 ; i <= limit; i++) {
            System.out.print(seriesFirstDigit + " , ");
            seriesFirstDigit = (seriesFirstDigit * 10) + 9;
        }
    }
}

