package collection.set.javaset;
import com.sun.source.tree.Tree;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        //Set<String> hashSet = new HashSet<>();
        //Set<String> LinkedHashSet = new HashSet<>();
        //Set<String> TreeSet = new HashSet<>();

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set){
        System.out.println("set = "+set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println();
    }
}
