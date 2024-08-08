package generic.ex1;

import java.util.Objects;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object;
        Integer integer2 = (Integer) integerBox.get();
        System.out.println("integer = "+integer);
        System.out.println("integer2 = "+integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        Object str = stringBox.get();
        System.out.println("str = "+str);

        //ObjectBox를 통해서 중복을 해결했다. 근데 문제가 있다
        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println(result);
    }
}
