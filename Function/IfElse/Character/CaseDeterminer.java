package IfElse.Character;

public class CaseDeterminer{
    public static void main(String[] args) {
     char ch = 'c';
    
     //https://www.geeksforgeeks.org/check-whether-the-given-character-is-in-upper-case-lower-case-or-non-alphabetic-character/
     if ((ch >= 'A') && (ch <='Z')){
         System.out.println(ch + " : this letter is presented in upper case");
     }
     else{
        System.out.println(ch + " : this letter is presented in Lower case");
     }
    } 
}
