//delete node with the value that the user enters in singly LL

import java.util.*;

public class deleteList {

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
        while (head != null) {
            head = head.getNext();
        }

        if (head == null) {
            System.out.println("LinkedList is empty");
        }

    }
}
