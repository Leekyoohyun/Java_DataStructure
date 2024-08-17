package collection.myLink;

public class NodeMain3 {
    public static void main(String[] args) {
        Node head = new Node("FootBall");
        head.next = new Node("Swimming");
        head.next.next = new Node("TableTennis");

        System.out.println(head);

        System.out.println("---- 모든 노드탐색 ----");
        printAll(head);

        System.out.println("---- 마지막 노드조회 ----");
        Node lastNode = getLastNode(head);
        System.out.println("마지막 노드: "+lastNode);

        System.out.println("---- 원하는 위치 조회 ----");
        Node index2Node = getNode(head, 2);
        System.out.println("2번째 노드: "+index2Node);

        //데이터 추가
        add(head, "BasketBall");
        System.out.println(head);

        //데이터 추가하고 마지막 노드 확인
        Node lastNode2 = getLastNode(head);
        System.out.println("데이터 추가 후 마지막 노드: "+lastNode2);

        //삭제
        remove(1);
        System.out.print("삭제 후 노드 확인: ");
        System.out.println(head);
    }

    public static void remove(int index){

    }

    public static void printAll(Node node){
        Node x = node;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    public static Node getLastNode(Node node){
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    public static Node getNode(Node node, int index){
        Node x = node;
        for(int i=0; i< index; i++){
            x = x.next;
        }
        return x;
    }

    public static void add(Node node, Object item){
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(item);
    }
}


