package For_loop;
//Write a program that will find and print the count of even numbers between 10 to 30.
public class number17 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<=30; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
