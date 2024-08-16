package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        Node first = new Node("nodeA");
        first.next = new Node("nodeB");
        first.next.next = new Node("nodeC");

        System.out.println("연결된 노드 출력");
        System.out.println(first);
    }
}
