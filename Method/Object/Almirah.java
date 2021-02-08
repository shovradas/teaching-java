package Method.Object;

class Almirah {
    int door;
    double width;
    Boolean isUsed;
    String type;
    int selves;
}

class Program1 {

    static void set(Almirah almirah, int door, double width, Boolean isUsed, String type, int selves) {
        almirah.door = door;
        almirah.width = width;
        almirah.isUsed = isUsed;
        almirah.type = type;
        almirah.selves = selves;
    }

    static void print(Almirah almirah) {
        System.out.println("Door no. : " + almirah.door);
        System.out.println("Width : " + almirah.width);
        System.out.println("isUsed : " + almirah.isUsed);
        System.out.println("Type : " + almirah.type);
        System.out.println("No. of Selves : " + almirah.selves);
    }
      public static void main(String[] args) {
            Almirah Almirah1;
            Almirah1 = new Almirah();

            set(Almirah1, 3, 2, true, "wooden", 10);
            print(Almirah1);

            Almirah Almirah2;
            Almirah2 = new Almirah();
            set(Almirah2, 3, 2, true, "wooden", 10);
            print(Almirah2);

        }
    }
