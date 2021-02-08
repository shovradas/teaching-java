package Method.Object;
public class FairSensor {
    String Shape;
    double diameter;
    int noOflight;
    Boolean haveAlarm;
    String company; 
}

class programFS{
    static void set(FairSensor fairSensor,  String Shape,double diameter, int noOflight, Boolean haveAlarm, String company){
        fairSensor.Shape = Shape;
            fairSensor.diameter = diameter;
            fairSensor.noOflight =noOflight;
            fairSensor.haveAlarm = haveAlarm;
            fairSensor.company = company;
    }
    static void print(FairSensor fairSensor) {
        System.out.println(fairSensor.Shape);
    System.out.println(fairSensor.diameter);
    System.out.println(fairSensor.noOflight);
    System.out.println(fairSensor.haveAlarm);
    System.out.println(fairSensor.company);
        
    }
    public static void main(String[] args){
        FairSensor fairSensor1;
        fairSensor1 = new FairSensor();
        set(fairSensor1, "round", 10.5, 2, true, "Electro");    
        print(fairSensor1);   
    }
}