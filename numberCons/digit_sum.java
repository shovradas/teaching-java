package numberCons;

public class digit_sum {
    public static void main(String[] args) {
        int n = 12345;
        int reminder = 0;
        int i = 0;
        int sum = 0;
        while (n > 0) { // jeheto n er value komce tai "n==0" hower age loop ses hobe
            reminder = n % 10; // last digit ta alade korlam -> 12345 % 10 = 5; 1234%10 = 4;...

            sum = sum + reminder; // basically reminder er addition gula sum a rakha. sum = inintial valiu +
                                  // reminder 5; now sum = 5; so,
                                  // sum = 0 +5 =5
                                  // sum = 5 + 4 (2nd reminder) = 9
                                  // sum = 9 + 3 (3rd reminder) = 12
                                  // sum = 12 +2 (4th reminder) =14
                                  // sum = 14 + 1 (5th reminder) =15

            n = n / 10; // n = 12345/10 = 1234 ; 1234/10 = 123; 123/10 = 12; 12/10 = 1 [so with loop "n"
                        // is decresing]
        }
        System.out.println(sum);
    }

}
