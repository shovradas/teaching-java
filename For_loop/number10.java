package For_loop;
// Write a program to print the formatted Series: 1 1, 2 2, 3 3, 4 4, 5 5, 6 6, …., N N
public class number10 {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int l = 10;
        for(int i = 1; i<=l; i++){
            n= i;
            m=i;
            System.out.print(n + "" + m);
            if(i<l){
                System.out.print(",");
            }
        }
    }
}
