//insert node in the beginning of a singly linked list

import java.util.*;

public class insertBeginSingly {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of nodes: ");
        int n = s.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for node " + (i + 1) + ": ");
            int data = s.nextInt();
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(head);
            head = newNode;

        }
        Node current = head;
        System.out.println("Linked List: ");
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print("->");
            }
            current = current.getNext();
        }

    }
}
