package collection.mySet;

import java.util.Arrays;
import java.util.LinkedList;

public class Hash1 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for(int i=0; i<CAPACITY; i++){
            buckets[i]= new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 4);
        add(buckets, 8);
        add(buckets, 15);
        add(buckets, 78);
        add(buckets, 9);
        add(buckets, 99);
        System.out.println(Arrays.toString(buckets));

        int searchValue = 8;
        boolean contains = contains(buckets, searchValue);
        if(contains){
            System.out.println(searchValue+" is exist");
        }else{
            System.out.println(searchValue+" can be def");
        }
    }


    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if(!bucket.contains(value)){
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
