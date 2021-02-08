package Method.Object;

 //Object and Class Example: Initialization through method

public class Teacher {
    String name;
    int id;
    String position;
    Boolean inBreak;
    int activeYear;
    int noOfUnits;
    double averageMark;
    String email;

    void addInfo(String n, int i, String p, Boolean b, int ay, int nu, double am, String e){
    name = n;
    id = i;
    position = p;
    inBreak = b;
    activeYear = ay;
    noOfUnits = nu;
    averageMark = am;
    email = e; 
    }

    void printInfo() {System.out.println(name+ " "+ id+" "+position+" "+inBreak+" "+activeYear+" "+noOfUnits+" "+averageMark+" "+email);};
}

class programT{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.addInfo("David", 1, "Tutor", false, 2013, 4, 61.6, "t1@t.com");
        t1.printInfo();
        
        Teacher t2 = new Teacher();
        t2.addInfo("Sandy", 2, "Lecturer", true, 2017, 0, 51.6, "t2@t.com");
        t2.printInfo();
    }
}