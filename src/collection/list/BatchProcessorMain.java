package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list  = new MyLinkedList<>();

       BatchProcessor processor = new BatchProcessor(list);
       processor.logic(100_00000); // ArrayList 사용시 4ms 걸림, LinkedList 사용시 3ms
    }
}
