package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장결과: "+result);
        System.out.println(set);

        System.out.println("set.contains(3): "+set.contains(3)); //O(n)
        System.out.println("set.contains(99): "+set.contains(99)); //O(n)
        // 이게 중복 체크할때 O(n) 계속 걸려서 성능이 떨어짐 그래서 Hash알고리즘 사용
    }
}
