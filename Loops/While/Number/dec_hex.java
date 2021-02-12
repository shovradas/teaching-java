package Loops.While.Number;

public class dec_hex {
    public static void main(String[] args) {
        
    int n = 222;
        int reminder = 0;
        int num = 0;
        int hex = 0;

        while (n > 0) {
            reminder = n % 16;
            n = n / 16;

            if (reminder == 10){
                System.out.println('A');
            }
            if (reminder == 11){
                System.out.println('B');
            }
            if (reminder == 12){
                System.out.println('C');
            }
            if (reminder == 13){
                System.out.println('D');
            }
            if (reminder == 14){
                System.out.println('E');
            }
            if (reminder == 15){
                System.out.println('F');
            }
        //     else{
        //     System.out.println(reminder);
        // }
            num = num * 10 + reminder; //
        }  //System.out.println(num);

        while (num > 0) {
            hex = num % 10; // 
            //System.out.print(hex);
            num = num / 10; //1
        }
    }

    
}
