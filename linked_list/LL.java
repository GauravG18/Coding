import java.sql.Time;
import java.util.List;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
        size--;
        return;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        return;
    }

    public int getSize() {
        return size;
    }

    // Iterative Method to Reverse
    // Time complexity - O(n)
    // Space complexity - O(1)

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;

            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prev;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void printList() {  
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            // System.out.println(currNode.data);
            currNode = currNode.next;
        }

        System.out.println("NULL");

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        // list.reverseIterate();
        // list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
