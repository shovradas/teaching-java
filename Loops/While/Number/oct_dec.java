package Loops.While.Number;

public class oct_dec {
    public static void main(String[] args) {
        int i = 1;
        int power = 1;
        int n = 27;
        int reminder;
        int dec = 0;

        while (n>0) {
        reminder = n%10;
        if (i==1){ 
        power=power*i;}
        else{
            power=power*8;
        }
            dec = dec + (power*reminder);
            n = n/10;
            i++;
            System.out.println(dec);
        }System.out.println(dec);
    }
}