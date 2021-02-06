class CircleCalculator {
    public static void main(String[] args) {
        // STEP5:
        // printf("%d\n", count);
        // goto STEP5

        // int count = 0;
        // STEP5:
        // printf("%d\n", count);
        // count++;
        // if(count<5){
        //     goto STEP5;
        // }     
        
        // int count = 0;
        // do{ //STEP5
        //     System.out.println(count);
        //     count++;
        // } while(count<5);  // if(count<5){ goto do; }


        // int count = 0;
        // while(count<5){ //if(count<5)
        //     System.out.println(count);
        //     count++;
        // } //{ goto while; }

        for(int count = 0; count<5; count++){ //count++; if(count<5);
            System.out.println(count);
        } //{ goto for;}

    }
}
