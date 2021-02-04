package Object;

public class Section {
    String name;
    int grade;
    int studentNo;
    double avgMark;   

    void info(String n, int g, int s, double a){
        name = n;
        grade = g;
        studentNo = s;
        avgMark = a;
    }
    void display(){System.out.println(name+" "+grade+" "+studentNo+" "+avgMark);}
    }

class programSC{
    public static void main(String[] args) {
       Section s1=new Section();
       s1.info("B3", 5, 40, 80.2); 
       s1.display();

       Section s2=new Section();
       s2.info("B4", 3, 40, 90.2); 
       s2.display();
    }
}