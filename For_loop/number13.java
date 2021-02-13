package For_loop;
//Write a program that will print all the even numbers between 1 to 20.
public class number13 {
    public static void main(String[] args) {
        int n = 20;
    for(int i = 1; i<=n; i++){
        if(i%2==0){
            System.out.print(i);
            if (i<n){
                System.out.print(",");
            }
        }
    }
    }
}
