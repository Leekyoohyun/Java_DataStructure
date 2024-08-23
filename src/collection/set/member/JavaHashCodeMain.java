package collection.set.member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = "+obj1.hashCode());
        System.out.println("obj2.hashCode() = "+obj2.hashCode());

        //각 class 마다 hashCode 를 Override 해둠
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = "+i.hashCode());
        System.out.println("A's hashCode() = "+strA.hashCode());
        System.out.println("AB's hashCode() = "+strAB.hashCode());

        //둘은 같을까? 다를까? 인스턴스는 다르지만, equals 는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 한 경우와 안한 경우 비교
        System.out.println("(member1 == member2) = "+(member1 == member2));
        System.out.println("(member1 equals member2) = "+(member1.equals(member2)));
        System.out.println("(member1.hashCode() = "+member1.hashCode());
        System.out.println("(member2.hashCode() = "+member2.hashCode());
        System.out.println((member1.hashCode() == member2.hashCode()));
    }
}
