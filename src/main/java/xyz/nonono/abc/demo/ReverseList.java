package xyz.nonono.abc.demo;

class Node {
    int value;
    Node next;

    public Node(int data) {
        this.value = data;
    }
}

public class ReverseList {
    public static void main(String[] args) {

        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node.next = node2;
        node2.next = node3;
        node3.next = null;

        show(node);
        node = reverseList(node);
        show(node);
    }

    public static Node reverseList(Node node) {
        Node pre = null;
        Node next = null;

        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }

        return pre;
    }

    public static void show(Node node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

}
