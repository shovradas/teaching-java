package Object;
public class FairSensor {
    String Shape;
    double diameter;
    int noOflight;
    Boolean haveAlarm;
    String company; 
}

class programFS{
    public static void main(String[] args){
        FairSensor fs;
        fs = new FairSensor();
                
            fs.Shape = "round";
            fs.diameter = 10.5;
            fs.noOflight =2;
            fs.haveAlarm = true;
            fs.company = "Elecro";

    System.out.println(fs.Shape);
    System.out.println(fs.diameter);
    System.out.println(fs.noOflight);
    System.out.println(fs.haveAlarm);
    System.out.println(fs.company);
    }
}