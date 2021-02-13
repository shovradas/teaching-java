package For_loop;
//Write a program that will print all the factors of a given number.
public class number23_factors {
    public static void main(String[] args) {
        int num = 60;
        for (int i=1; i<=60; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
