
import java.util.*;

public class singlyLL {

    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // a.next = b;
        // b.next = c;
        // Node temp = a;
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

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
