//insert node at the end of a singly linked list

import java.util.*;

public class insertEndSingly {

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

        }

        System.out.println("Enter value to insert at the end: ");
        int val = s.nextInt();
        Node newNode = new Node();
        newNode.setData(val);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);

        }

        Node c = head;
        System.out.println("Linked List: ");
        while (c != null) {
            System.out.print(c.getData());
            if (c.getNext() != null) {
                System.out.print("->");
            }
            c = c.getNext();
        }

    }
}
