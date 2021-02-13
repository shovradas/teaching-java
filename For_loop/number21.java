package For_loop;
//Write a program that will find and print the summation of all the even numbers between 60 to 90.
public class number21 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 60; i<=90; i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
