package IO;
import java.util.Scanner;
public class StandardIO2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter String : ");
        String a = sc.nextLine();

        System.out.println("Enter int : ");
        int b = sc.nextInt();
  
        System.out.println("Enter double : ");
        double c = sc.nextDouble();

        System.out.println("String : " + a);
        System.out.println("Intergers : " + b);
        System.out.println("Double : " + c);
}
} 