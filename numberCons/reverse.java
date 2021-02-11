package numberCons;

public class reverse {
    public static void main(String[] args) {   
    
    int n = 1278;
    int reverse =0;
    int reminder = 0;

    while (n>0){
        reminder = n%10;
        reverse= reverse * 10 + reminder;
        n = n/10;
    }
    System.out.print(reverse);
    }
    
}
