package Loops.While.Number;

//1,2,4,7,11,.....,N
public class formattedSeries8 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int seriesVal = 1;
        System.out.println(seriesVal);
        while (i<=n){
            seriesVal = seriesVal + i;
            System.out.println(seriesVal);
            i++;
        }
    }
    
}
