package String.StringBuilder;

public class Number26_replace_Last_occurance {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hello hobart");
        char given_char='h';
        int i = 0;
        int index = 0;
        //int count = 0;
        for(i = 0;i < a.length()-1;i++){
            if(a.charAt(i)==given_char){
                index = i;
            }
        } 
        a.setCharAt(index, '*'); // str1[0] = 'H'
        System.out.println(a);
    }  
}
