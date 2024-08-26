package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복 등록안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 성공
        Member searchValue = new Member("A");
        boolean result = set.contains(searchValue);
        System.out.println(result);
    }
}