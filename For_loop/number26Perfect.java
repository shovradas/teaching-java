package For_loop;

public class number26Perfect {

    static boolean isPerfect(int perNumber) {
        if (perNumber == 1) { // 1 is not a perfect number
            return false;
        }
        int sum = 1;// sum of all dividers and 1 is divider of all numbers
        int i; // 1 is divisors so i starting with 2
        for (i = 2; i <= perNumber; i++) {
            if (perNumber % i == 0) { // perNumber i dia vag hole e sum korbe
                sum += i;
            }
        }
        if (sum == perNumber) { // vag jay amon sob sonkhar jogfol jodi sei vag dea sonkhatar soman hoy
            return true;
        }
        return false; // static boolean isPerfect(int perNumber) ei function er return
    }

    // Driver program
    public static void main(String[] args) {
        int perNumber = 6; //1+2+3 =6 which is a parfect number as 6/1=1; 6/2=3; 6/2=3
        if (isPerfect(perNumber))
            System.out.println(perNumber + " is a perfect number");
        else
            System.out.println(perNumber + " is not a perfect number");
    }

}
