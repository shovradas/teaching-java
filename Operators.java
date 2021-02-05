public class Operators {
    public static void main(String args[]) {
        System.out.println("***** Unary Operator *****");
        System.out.println("++ and --");
        int i = 10;
        System.out.println("Incremental Postfix : " + i++);
        System.out.println("Incremental Prefix : " + ++i);
        System.out.println("Dicremental Postfix : " + i--);
        System.out.println("Dicremental Prefix : " + --i);
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);// 10+11=21

        System.out.println("~ and !");
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// -11 (minus of total positive value which starts from 0)
        System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
        System.out.println(!c);// false (opposite of boolean value)
        System.out.println(!d);// true

        System.out.println("*****Java Arithmetic Operator Example*****");
        System.out.println("Add : " + (10 + 20));
        System.out.println("Sub : " + (10 - 20));
        System.out.println("Mul : " + (10 * 20));
        System.out.println("Div : " + (10 / 20));
        System.out.println("Mod : " + (10 % 20));

        System.out.println("*****Java Left Shift Operator*****");
        System.out.println(10 << 2);// 10*2^2=10*4=40
        System.out.println(10 << 3);// 10*2^3=10*8=80

        System.out.println("*****Java Right Shift Operator*****");
        System.out.println(10 >> 2);// 10/2^2=10/4=2
        System.out.println(20 >> 2);// 20/2^2=20/4=5

        System.out.println("***** >> vs >>> *****");
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2); // confused

        System.out.println("***** Logical && and Bitwise & *****");
        System.out.println("Logical And : " + (10 < 20 && 5 < 20)); // The logical && operator doesn't check second
                                                                    // condition if first condition is false.


        System.out.println("***** Logical || and Bitwise | *****");
        System.out.println("Logical And : " + (10 < 20 || 5 < 20)); // The logical || operator doesn't check second
                                                                    // condition if first condition is true.

        System.out.println("***** Java Ternary Operator *****");
        int min = (10 < 20) ? 10 : 20;
        System.out.println(min);

        System.out.println("Assignment = += -= *= /= %= &= ^= |= <<= >>= >>>=");
        int x = 10;
        int y = 20;
        x += 4;// x=x+4 (a=10+4)
        y -= 4;// y=y-4 (b=20-4)
        System.out.println(x);
        System.out.println(y);
        x *= 4;// x=x+4 (a=10+4)
        System.out.println(x);
        x /= 4;// x=x+4 (a=10+4)
        System.out.println(x);
    }
}
