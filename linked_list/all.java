import java.io.*;
import java.util.*;

public class all {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePI() {
            if (size <= 1) {
                return;
            }

            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

        public int kthFromLast(int k) {
            // write your code here
            Node s = head;
            Node f = head;
            for (int i = 0; i < k; i++) {
                f = f.next;
            }
            while (f != tail) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }

        public int mid() {
            Node s = head;
            Node f = head;

            while (f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s.data;
        }

        // MERGE TWO SORTED LINKEDLIST

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList result = new LinkedList();
            while (one != null && two != null) {
                if (one.data < two.data) {
                    result.addLast(one.data);
                    one = one.next;
                } else {
                    result.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                result.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                result.addLast(two.data);
                two = two.next;
            }

            return result;
        }

        // SORT THE UNSORTED LINKEDLIST USING => MERGE SORT

        public static Node midNode(Node head, Node tail) {
            Node s = head;
            Node f = head;

            while (f != tail && f.next != tail) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }

        public static LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }
            Node mid = midNode(head, tail);
            LinkedList firstSortedHalf = mergeSort(head, mid);
            LinkedList secondSortedHalf = mergeSort(mid.next, tail);
            LinkedList result = LinkedList.mergeTwoSortedLists(firstSortedHalf, secondSortedHalf);

            return result;
        }

        // TO REMOVE THE DUPLICATE DATA FROM THE LINKEDLIST

        public void removeDuplicate() {
            LinkedList result = new LinkedList();

            while (this.size > 0) { // <= 'this' is used here using OOPS concept to call the linkedlist that will be
                                    // provided in the question. That is to be used
                int val = this.getFirst();
                this.removeFirst();
                if (result.tail.data != val) {
                    result.addLast(val); // this method is occuring in O(n) time and constant time complexity
                } // because removeFirst is used first and then addLast is used
            } // We cannot change or modify the value or the properties if "this"
            this.head = result.head;
            this.tail = result.tail;
            this.size = result.size;
        }

        // TO SORT THE LINKEDLIST WITH FIRST ODD NO ONLY AND THEN EVEN NO

        public void oddEven() {

            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();
            while (this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();
                if (val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
            }

            if (odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if (odd.size == 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            } else {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            }
        }

        // TO REVERSE THE LINKEDLIST ELEMENTS IN THE GROUP OF K ELEMENTS. HERE K IS THE
        // N OF ELEMENTS TO BE REVERSED
        // Q. 1 2 3 4 5 6 7 8 9 10 11
        // Ans. 3 2 1 6 5 4 9 8 7 10 11

        public void KReverse(int k) {
            LinkedList previous = null;
            while (this.size > 0) {
                LinkedList current = new LinkedList();

                if (this.size >= k) {
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addFirst(val);
                    }
                } else {
                    int s = this.size();
                    for (int i = 0; i < s; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addLast(val);

                    }

                    if (previous == null) {
                        previous = current;
                    } else {
                        previous.tail.next = current.head;
                        previous.tail = current.tail;
                        previous.size = previous.size + current.size;
                    }

                    this.head = previous.head;
                    this.tail = previous.tail;
                    this.size = previous.size;
                }
            }
        }

        // To display reversed linkedlist recursively
        private void displayReverseHelper(Node node) {
            if (node == null) {
                return;
            }
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse() {
            displayReverseHelper(head);
            System.out.println();
        }

        // Q. Reverse a linkedlist using pointer using recursion

        private void reversePRHelper(Node node) { // PR means pointer here
            if (node == null) {
                return;
            }
            reversePRHelper(node.next);
            if (node == tail) {
                // nothing to do
            } else {
                node.next.next = node; // IMPORTANT STEP " LEARN IT" TO REVERSE THE DIRECTION TO NODE
                                       // Eg. 1->2 to 2<-1
            }
        }

        public void reversePR() {
            reversePRHelper(head);
            head.next = null;
            Node temp = head;
            head = tail;
            tail = head;
        }

        // Q. To reverse the LINKEDLIST by changing only the data not the node position
        // contraint= time O(n) and constant space complexity

        public void reverseDRHelper(Node right, int floor) {
            if (right == null) {
                return;
            }

            reverseDRHelper(right.next, floor + 1);
            if (floor >= size / 2) {
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;

                rleft = rleft.next;
            }

        }

        Node rleft;

        public void reverseDR() {
            rleft = head;
            reverseDRHelper(head, 0);
        }

        // Q. PALLINDROME LINKED LIST
        // Time complexity- O(n) and constatn space

        private boolean IsPalindromeHelper(Node right) {
            if (right == null) {
                return true;
            }

            boolean rres = IsPalindromeHelper(right.next);
            if (rres == false) {
                return false;
            } else if (right.data != pleft.data) {
                return false;
            } else {
                pleft = pleft.next;
                return true;
            }
        }

        Node pleft;

        public boolean IsPalindrome() {
            pleft = head;
            return IsPalindromeHelper(head);
        }


        // Q. FOLD THE LINKEDLIST 

        private void foldHelper(Node right,int floor){
            if(right ==null){
                return;
            }

            if(floor>size/2){
                Node temp=fleft.next;
                fleft.next=right.next;
                right.next=temp;
                fleft=temp;
            }
            else if(floor==size/2){
                tail=right;
                tail.next=null;
            }
        }

        Node fleft;
        public void fold(){
            fleft=head;
            foldHelper(head, 0);
        }

        // Q. ADD TWO LINKEDLIST
            //   9-9-9-9
            // +     1-1
            // ---------
            // 1-0-0-1-0  

        


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        System.out.println(l1.IsPalindrome());
    }
}



