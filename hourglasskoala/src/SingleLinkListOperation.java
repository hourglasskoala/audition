public class SingleLinkListOperation {

    public static void main(String args[]) {
        Node head = new Node(4);
        Node node1 = new Node(3);
        Node node2 = new Node(6);
        Node node3 = new Node(9);
        Node tail = new Node(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = tail;
        tail.next = null;

        quddbleSort(head);

        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);

    }


    /**
     * @param head
     * @desc 依次比较相邻的结点，如果是逆序的就交换两个结点
     */
    public static Node quddbleSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node tail = null, cur = head;

        while (cur.next != tail) {
            while (cur.next != tail) {
                if (cur.data > cur.next.data) {
                    int temp = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                }
                cur = cur.next;
            }
            tail = cur;
            cur = head;
        }
        return head;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
