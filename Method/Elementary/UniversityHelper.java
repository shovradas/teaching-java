package Method.Elementary;
public class UniversityHelper {

    static int compete(int numOfExaminees, int numOfSeats){
        int competeForEachSit = numOfExaminees/numOfSeats;
        return competeForEachSit;
    }
    public static void main(String[] args) {
       System.out.println("Contestants are going to compete for each seat : " + compete(30,10));
    }
}
