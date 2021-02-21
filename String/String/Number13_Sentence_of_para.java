package String.String;

//Write a program to find how many sentences are there in a given paragraph.
public class Number13_Sentence_of_para {
    public static void main(String[] args) {
        String a = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph.";
        int count = 0;
        for(int i = 0; i<a.length(); i++){
            if((a.charAt(i) == '.') || (a.charAt(i) == '?') || (a.charAt(i) == '!')){
                count++;
            }
        }
        System.out.println(count);
    }
}
