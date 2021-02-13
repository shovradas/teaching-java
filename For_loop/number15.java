package For_loop;
//Write a program that will print all the numbers between 11 to 57 which are multiple of 5.
public class number15 {
    public static void main(String[] args) {
        for(int i = 11; i<=57; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
