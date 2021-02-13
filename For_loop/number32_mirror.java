package For_loop;

public class number32_mirror {
    public static void main(String[] args) {
        int num = 7654321;
        int reminder;
        int mirror_num = 0;
        for (int i = 0; i<=num; i++){
            reminder = num%10;
            num= num/10;
        mirror_num = mirror_num*10+reminder;
        }System.out.println(mirror_num);
        }
    }

