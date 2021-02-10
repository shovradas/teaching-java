package Loops.While.Character;
//Write a program that will print all the characters between 'A' to 'Z' and highlight the characters which are part of your name. You can highlight the characters using a square bracket.
public class highlight {
public static void main(String[] args) {
    char i = 'A';

    while (i<='Z'){
        if ((i== 'P')|| (i == 'R')|| (i == 'I') || (i=='T')|| (i=='Y')){
            System.out.println( "["+i+"]");
        }
        else{ System.out.println(i);}
    i++;
    }
}
}
