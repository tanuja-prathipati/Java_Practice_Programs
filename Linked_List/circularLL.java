
import java.util.*;

public class circularLL {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int n = s.nextInt();
        Node head = null, temp = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for node: " + (i + 1));
            int val = s.nextInt();
            Node newNode = new Node();
            newNode.setData(val);
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
        if (temp != null) {
            temp.setNext(head);
        }
        Node c = head;
        if (head != null) {
            if (c != null) {
                do {
                    System.out.print(c.getData());
                    c = c.getNext();
                    if (c != head) {
                        System.out.print("->");
                    } else {
                        System.out.println("->" + head.getData());
                    }

                } while (c != head);
            }
        }

    }
}
