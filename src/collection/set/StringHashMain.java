package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println((int)charA);
        System.out.println((int)charB);

        //hashCode
        System.out.println();
        System.out.println("A: "+hashCode("A"));
        System.out.println("B: "+hashCode("B"));
        System.out.println("AB: "+hashCode("AB"));

        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);

        //hashIndex 출력
        System.out.println("hashIndex(A) = "+hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = "+hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = "+hashIndex(hashCode("AB")));
    }

    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for(char c : charArray){
            sum = sum+(int) c;
        }
        return sum;
    }

    static int hashIndex(int hashCode){
        return hashCode % CAPACITY;
    }
}
