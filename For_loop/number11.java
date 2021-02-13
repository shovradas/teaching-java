package For_loop;

//Write a program to print the formatted Series: 1 1, 2 2, 4 3, 8 4, 16 5, 32 6, …., N M
public class number11 {
    public static void main(String[] args) {
        int n = 10;
        int x = 1;
        int y = 1;
        for (int i = 1; i <= n; i++) {
            y = i;
            System.out.print(x + "" + y);
            x = x * 2;
            if (i < n) {
                System.out.print(",");
            }
        }
    }
}
