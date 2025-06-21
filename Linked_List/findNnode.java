// find nth node in linkedlist from last

import java.util.*;

public class findNnode {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int n = s.nextInt();
        Node head = null, temp = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of node " + (i + 1));
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
        System.out.println("Enter node to search: ");
        int pos = s.nextInt();
        Node first = head;
        Node second = head;
        for (int i = 0; i < pos; i++) {
            if (first == null) {
                System.out.println("Position is larger than list length");
                return;
            }
            first = first.getNext();
        }
        while (first != null && second != null) {
            first = first.getNext();
            second = second.getNext();
        }
        if (second == null) {
            System.out.println("Node not found");
            return;
        }
        System.out.println("Data with position at " + pos + " from the end is: " + second.getData());

    }
}
