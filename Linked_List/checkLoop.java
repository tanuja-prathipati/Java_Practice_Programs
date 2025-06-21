//check if linkedlist has a loop or not (Floyd’s Cycle Detection Algorithm (also called the tortoise and hare method))

import java.util.*;

public class checkLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of nodes: ");

        int n = s.nextInt();
        Node head = null, temp = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for node " + (i + 1) + ": ");
            int data = s.nextInt();
            Node newNode = new Node();
            newNode.setData(data);
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                if (temp != null) {
                    temp.setNext(newNode);
                    temp = newNode;
                }
            }
            // if (head != null && head.getNext() != null) {
            //     temp.setNext(head.getNext()); // creates a loop - loop exists
            // }

        }
        Boolean b = loop(head);
        if (b) {
            System.out.println("Loop exists");
        } else {
            System.out.println("No Loop");
        }

    }

    public static boolean loop(Node head) {
        Node slowptr = head, fastptr = head;
        while (slowptr != null && fastptr != null && fastptr.getNext() != null) {
            slowptr = slowptr.getNext();
            fastptr = fastptr.getNext().getNext();
            if (slowptr == fastptr) {
                return true;
            }

        }
        return false;
    }

}
