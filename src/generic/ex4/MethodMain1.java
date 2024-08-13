package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자전달");
        Integer result = GenericMethod.<Integer>genericMethod(i); // 없어도 됨. 컴파일러가 추론함
        Integer integerValue = GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0); // 얘도 없어도됨
    }
}
