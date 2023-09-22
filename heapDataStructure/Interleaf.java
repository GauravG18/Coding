import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Interleaf {
    // Write a function void interleave (int que[maxsize], int front, int rear) in
    // C/C++ that takes a queue of integers of even length as a parameter and
    // rearrange the elements by interleaving the first half of the queue with the
    // second half of the queue. Only a stack can be used as an auxiliary (extra)
    // space. For example, suppose a queue called que stored the following
    // sequence of values: Input: [1,2,3,4,5,6,7,8,9,10]. After the function
    // execution contents of the queue should be: [1,6,2,7,3,8,4,9,5,10].
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int size = scn.nextInt(); // size should be even;

        for (int i = 1; i <= size; i++) {
            que.offer(i);
        }
        interleave(que, 0, que.size() - 1);
        System.out.println(que);
    }

    static void interleave(Queue<Integer> que, int front, int rear) {
        if (front > rear) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < que.size() / 2; i++) {
            stack.push(que.poll());
        }
        int idx = 0;
        for (int i = 0; i < stack.size(); i++) {
            

        }
    }
}
