import java.util.Scanner;
class staticclasses {
    static int s;
    static void add(int a, int b) {
        System.out.println("static method to calculate sum");
        s = a + b;
        System.out.println(a + "+" + b);
    }
    static class MyNestedClass {
        static {
            System.out.println("static block inside a static class");
        }
        public void disp() {
            int c, d;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two values");
            c = sc.nextInt();
            d = sc.nextInt();
            add(c, d);
            System.out.println("Sum of two numbers-" + s);
        }
    }
}
 class Test {
    public static void main(String args[]) {
        staticclasses.MyNestedClass s = new staticclasses.MyNestedClass();
        s.disp();
    }
}