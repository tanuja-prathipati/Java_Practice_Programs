//create node at a position in a doubly LL

import java.util.*;

public class insertPosDoubly {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of nodes: ");
        int n = s.nextInt();
        Node head = null, temp = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for node " + (i + 1));
            int val = s.nextInt();
            Node newNode = new Node();
            newNode.setData(val);
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                if (temp != null) {
                    newNode.setPrev(temp);
                    temp.setNext(newNode);
                    temp = newNode;
                }
            }
        }
        Node t = head;
        Node newNode = new Node();
        System.out.println("Enter data for new node: ");
        int data = s.nextInt();
        newNode.setData(data);
        System.out.println("Enter position: ");
        int pos = s.nextInt();
        if (pos == 0) {
            newNode.setNext(head);
            if (head != null) {
                head.setPrev(newNode);
            }
            head = newNode;
        } else {
            for (int i = 0; i < pos - 1 && t != null; i++) {
                t = t.getNext();
            }
            if (t == null) {
                System.out.println("Position out of bounds");
                return;
            }
            Node next = t.getNext();
            newNode.setPrev(t);

            newNode.setNext(next);
            t.setNext(newNode);
            if (next != null) {
                next.setPrev(newNode);
            }
        }

        Node curr = head;
        Node last = null;

        System.out.println("Forward Traversal: ");
        while (curr != null) {
            System.out.print(curr.getData());
            if (curr.getNext() != null) {
                System.out.print("->");
            }
            last = curr;
            curr = curr.getNext();
        }
        System.out.println();
        System.out.println("Backward Traversal: ");
        curr = last;
        while (curr != null) {
            System.out.print(curr.getData());
            if (curr.getPrev() != null) {
                System.out.print("<-");
            }
            curr = curr.getPrev();
        }
    }
}
