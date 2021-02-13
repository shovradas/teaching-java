package For_loop;

//Write a program to print the formatted Series: 1, 2, 4, 7, 11, …., N
public class number9 {
    public static void main(String[] args) {
        int n = 10;
        int series = 1;
        for (int i = 0; i <= n; i++) {
            series = series+i;
            System.out.print(series);
            if (i < n) {
                System.out.print(",");
            }
        }
    }
}
