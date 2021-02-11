package numberCons;

public class separateDigits {
    public static void main(String[] args) {
        int n = 12345;
        int reminder=0;
        int i =0;
        int count = 0;
        while(n>0){ // jeheto n er value komce tai "n==0" hower age loop ses hobe
            reminder = n%10; // last digit ta alade korlam -> 12345 % 10 = 5; 1234%10 = 4;...
            System.out.println(reminder);
            n=n/10; // n = 12345/10 = 1234 ; 1234/10 = 123; 123/10 = 12; 12/10 = 1 [so with loop "n" is decresing]
        if (reminder != 0){ //jokhoni reminder pabe count ++
            count++;}
        }
        System.out.println(count);
    }
    
}
