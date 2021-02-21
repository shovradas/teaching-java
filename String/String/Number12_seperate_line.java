package String.String;
//Write a program to print all the words in a given sentence in separate lines.
public class Number12_seperate_line {
    public static void main(String[] args) {
        String a = "Write a program to print all the";
        int count = 1;
        for (int i = 0; i<a.length(); i++) {
            System.out.println(a.charAt(i));
            if (a.charAt(i) == ' '){
                System.out.print(a.charAt(i));}
                
            //     ss//count=i;
            //     // for( i=0; i<count; i++){
            //     // //System.out.println(a.charAt(i));
            //     // }
            // }
        }
       // System.out.println(count);
    }
}
