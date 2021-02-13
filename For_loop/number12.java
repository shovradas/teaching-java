package For_loop;
//Write a program to print the formatted Series: 1 1, 2 2, 3 4, 4 8, 5 16, 6 32, …., N M
public class number12 {
    public static void main(String[] args) {
        int n = 10;
        int x = 1;
        int y = 1;
        for (int i = 1; i <= n; i++) {
            x = i;
            System.out.print(x + "" + y);
            y = y * 2;
            if (i < n) {
                System.out.print(",");
            }
        }
    }
}
