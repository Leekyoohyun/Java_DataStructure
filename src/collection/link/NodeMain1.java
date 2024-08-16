package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기
        Node first = new Node("nodeA");
        first.next = new Node("nodeB"); // nodeB를 생성
        first.next.next = new Node("nodeC"); // nodeC 생성

        System.out.println("==== 모든 노드 탐색! ====");
        System.out.println(first.item);
        System.out.println(first.next.item);
        System.out.println(first.next.next.item);
        System.out.println("==== 루프로 탐색하기 ====");
        Node x = first;
        while(x != null){
            System.out.println(x.item);
            x= x.next;
        }
    }
}
