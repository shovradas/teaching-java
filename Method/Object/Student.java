package Method.Object;
 //Object and Class Example: Initialization through method
public class Student {
   int ID;
   String name;
   int year;
   double CGPA;
   Boolean attentive;
   String email;
   String uniName;
   
   void addDetail(int i, String n, int y, double c, boolean a, String e, String u){
    //void insertRecord(int i, String n, int y, double c, boolean b, String e, String u){
    ID = i;
    name = n;
    year = y;
    CGPA = c;
    attentive = a;
    email = e;
    uniName = u;  
   }

   void printInfo(){System.out.println(ID + " " +name + " " + year + " " + CGPA + " " + attentive + " " + email + " " + uniName);} // what type od methos is this?
}

class programSt {
   public static void main(String[] args) {
        Student s1 = new Student();
        s1.addDetail(1, "Sara", 2, 3.3, true, "e&e.com", "UTAS"); // inserting data for student 1
        s1.printInfo(); //printing info of S1

        Student s2 = new Student();
        s2.addDetail(2, "Rima", 3, 3.7, true, "c@c.com", "UTS");
        s2.printInfo();
    }
}

