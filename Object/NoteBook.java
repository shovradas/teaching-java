package Object;

public class NoteBook {
    String subject;
    int page;
    boolean isCovered;
    double height;
    double width;
}

class programNB{
    public static void main(String[] args){
        NoteBook nb = new NoteBook(); 
    nb.subject = "Programming";
    nb.page = 120;
    nb.isCovered = true;
    nb.height = 1;
    nb.width = .75;
    
    System.out.println(nb.subject);
    System.out.println(nb.page);
    System.out.println(nb.isCovered);
    System.out.println(nb.height);
    System.out.println(nb.width);

    }
}