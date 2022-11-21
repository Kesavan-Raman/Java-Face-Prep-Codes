import java.util.*;

public class DDL {
    //node class
        class Node {
            int data;
            Node prev;
            Node next;

            public Node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }

        }

        Node head = null;
        Node tail = null;


        public class addNode(int d) {
            Node newNode = new Node(d);

            if (head == null) {
                head = newNode;
                tail = newNode;
                head.prev = null;
                head.next =  null;


            } else {
                tail.next = newNode;
                tail.prev = tail;
                tail = newNode;
                tail.next = null;               

        }

    
        
}

public class Main {
    public static void main(String[] args) {
        DDL list  = new DDL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(1);
        list.addNode(2);

        Node curr = head;
        if(curr == null) {
            System.out.println("List is empty");

        }
        while (curr!= null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
}
}