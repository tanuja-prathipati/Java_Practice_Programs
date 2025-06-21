//create node at the beginning of a doubly LL

import java.util.*;

public class insertBeginDoubly {

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
        if (head == null) {
            head = newNode;
        } else {
            if (t != null) {
                t.setPrev(newNode);
                newNode.setNext(t);
                head = newNode;

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
