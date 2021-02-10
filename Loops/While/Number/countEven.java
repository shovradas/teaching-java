package Loops.While.Number;

//Write a program that will find and print the count of even numbers between 10 to 30.
public class countEven {
    public static void main(String[] args) {
        
    int i = 10;
    int count = 0;
    while(i<=30){
        if(i%2==0){
            count ++;
        }
        i++;
    }
    System.out.println("Total even number: " + count);
}
}
