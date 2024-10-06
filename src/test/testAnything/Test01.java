package test.testAnything;

public class Test01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a++;

        System.out.println(a);

        b= a++;
        System.out.println(a+","+b);

        a=b=0;

        a++;
        b = ++a;
        System.out.println(a+","+b);
    }
}
