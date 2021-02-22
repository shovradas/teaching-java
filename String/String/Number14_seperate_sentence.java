package String.String;
//Write a program to print all the sentences in a given paragraph in separate lines.
public class Number14_seperate_sentence {
    public static void main(String[] args) {
        String a = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph.";
        for (int i = 0; i<a.length(); i++) {
            System.out.print(a.charAt(i));
            if((a.charAt(i) == '.') || (a.charAt(i) == '?') || (a.charAt(i) == '!')){
            System.out.print(a.charAt(i)+ "\n");}
        }
    }
}
