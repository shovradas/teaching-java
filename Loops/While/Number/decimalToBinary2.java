package Loops.While.Number;

//32,16,8, 4,2, 1
import java.util.Scanner;

public class decimalToBinary2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 128;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        int dec = 75; // 2^6 =64, 2^5 = 32, 2^4=16, 2^3 = 8, 2^2 = 4, 2^1 = 2, 2^0 =1 ; 75 - 64 = 11;
                      // 11-8 =3 ;3-2 = 1; 1-1 = 0
        while (i <= n) {
            System.out.println(sum);
            sum = sum / 2;
            int num = dec - sum; // sum theke dec-sum = j somkha ta hobe tar cheye coto sonlha khujbe
            System.out.println("d" + num);
            // if ((sum <=dec)&&(dec-sum <= dec)){

            // System.out.println("binary : " + '1');
            // //sum= dec -sum;
            // }
            // else {
            // System.out.println("binary : " +'0');
            // }
            i++;
        }
    }
}
