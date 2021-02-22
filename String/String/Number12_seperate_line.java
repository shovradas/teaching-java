package String.String;
//Write a program to print all the words in a given sentence in separate lines.
public class Number12_seperate_line {
    public static void main(String[] args) {
        String a = "Write a program to print all the";
        for (int i = 0; i<a.length(); i++) {
            System.out.print(a.charAt(i));
            if (a.charAt(i) == ' '){
                System.out.print(a.charAt(i)+ "\n");}
        }
    }
}
