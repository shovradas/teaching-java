package String.String;
//Write a program that will count the number of vowels in a string.
public class Number16_count_vowel {
    public static void main(String[] args) {
        String a= "I Love cooking";
        int count = 0;
        for(int i = 0; i<a.length(); i++){
            if((a.charAt(i)== 'a') || (a.charAt(i)== 'e')||(a.charAt(i)== 'i')||(a.charAt(i)== 'o')||(a.charAt(i)== 'u')){
                count++;
            }
        }
        System.out.println(count);
    }
}
