package Loops.While.Character;
//Write a program that will print all the available standard (not extended) ASCII characters along with their ASCII codes.
public class ASCII {
    public static void main(String[] args) {
        int i = 0;
    while (i <= 127){
        System.out.println("Ascii value of     " + (char)i + "    is : " + i);
        i++;
    }
    }
}
