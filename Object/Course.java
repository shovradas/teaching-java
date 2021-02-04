package Object;

public class Course {
    String name;
    int unitCode;
    String department;
    int durationInMonths;
    double fees;
    boolean havePlacement;  
    
    void addInfo(String n, int i,  String p, int j, double d, boolean b){
    name = n;
    unitCode = i;
    department = p;
    durationInMonths = j;
    fees = d;
    havePlacement = b;
    }

    void display(){System.out.println(name+" "+unitCode+" "+department+" "+durationInMonths+" "+fees+" "+havePlacement);}
}
class programC{
    public static void main(String[] args) {

        Course c1 = new Course();
        c1.addInfo("Java", 502, "ICT", 4, 1200.50, true);
        c1.display();

        Course c2 = new Course();
        c2.addInfo("C#", 503, "ICT", 5, 1250.50, true);
        c2.display();
    }
}
