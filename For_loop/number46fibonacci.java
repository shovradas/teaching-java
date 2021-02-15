package For_loop;
//Write a program to print the Fibonacci Series: 1, 1, 2, 3, 5, 8, …., N
public class number46fibonacci {
    public static void main(String[] args) {
        int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (i=1;i <= n; i++)
        {
            System.out.print(t1);

            int sum = t1 + t2; //sum = 0+1 = 1, so t1 = 0, t2 = 1, t3 = 0+1 = 1, t4 = 1+1 = 2, t5 = 2+1 = 3, t6 = 2+3 = 5......
            t1 = t2;            
            t2 = sum;
            if (i<n){
                System.out.print("+");
            }

        }
    }
}