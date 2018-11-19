package interviewpreparationkit.StacksandQueues;

import java.util.Scanner;
import java.util.Stack;

public class QueueATaleofTwoStacks {
    public static class MyQueue<T>{
        Stack<T> firstStack = new Stack<>();
        Stack<T> secondStack = new Stack<>();

    private void enqueue(T data){
        firstStack.push(data);
    }

    private void dequeue(){}

    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
