package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입이 결정된다.
        integerBox.set(10);
        //integerBox.set("문자100"); 컴파일 오류난다.
        Integer integer = integerBox.get();
        System.out.println("integer = "+ integer);

        GenericBox<String> stringBox = new GenericBox<String>(); //new GenericBox<String>()에서 String은 생략가
        stringBox.set("문자100");
        String str = stringBox.get();
        System.out.println("str = "+str);

        //원하는 타입이 모두 사용 가능하다.
    }
}
