package generic.ex1;

public class GenericBox<T> { //제네릭 클래스에서는 타입을 미리 결정하지 않는다. T는 타입 매개변수라고 함.

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
