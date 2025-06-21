
import java.util.*;

public class deleteBeginSingly {

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
        if (head != null) {
            head = head.getNext();
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
