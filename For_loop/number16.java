package For_loop;
//Write a program that will find and print the count of odd numbers between 1 to 20.
public class number16 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =1; i<=20; i++){
            if(i%2!=0){
                count++;
            } 
        }System.out.println(count);
    }
}
