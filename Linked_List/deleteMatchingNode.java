//delete node with the value that the user enters in singly LL

import java.util.*;

public class deleteMatchingNode {

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
        System.out.println("Enter the value of the node to be deleted: ");
        int val = s.nextInt();
        Node curr = head, prev = null;
        //if that node is first node
        if (curr != null && curr.getData() == val) {
            head = curr.getNext();  // move head to next
        } else {
            while (curr != null && curr.getData() != val) {
                prev = curr;
                curr = curr.getNext();
            }
            if (curr != null&&prev!=null) {
                prev.setNext(curr.getNext());
            }
        }

        Node current = head;
        System.out.println("Linked List: ");
        while (current != null) {
            System.out.print(current.getData());
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.getNext();
        }

    }
}
