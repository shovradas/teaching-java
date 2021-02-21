package String.String;

//Write a program that will search for a pattern "he" in a string. If found print the position else print "NOT FOUND"
public class Number19_find_pattern {
    public static void main(String[] args) {
        String a = "hillo hunny bunny";
        String start = "he";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (start.charAt(0) == a.charAt(i) && start.charAt(1) == a.charAt(i + 1)) {
                System.out.println("yes");
            } 
            else {count++;}
        }
        if(count>=a.length()){
            System.out.println("NOT FOUND");
        }
    }
}
