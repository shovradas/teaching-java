package For_loop;
//Write a program that will find and print the count of numbers between 1 to 50 which are multiple of 7.
public class number18 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<=50; i++){
            if(i%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
