package test;

public class Test02 {
    public static void main(String[] args) {
        String slogan = "창의와 나눔으로 세상에 힘이되는 한양";
        String slogan2 = " "+slogan+" ";
        String slogan3 = slogan2.trim();
        System.out.println(slogan == slogan3);
        System.out.println(slogan.equals(slogan3));

        int r = 3;
        double pi = 3.14;
        System.out.println(2 * pi * r > 20);


    }
}
