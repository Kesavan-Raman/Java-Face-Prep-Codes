import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class seperateNodes {
    Node curr = null;
    if((curr.data)%2 == 0) {
        curr.prev = curr.next.  ;
        curr.next.next = curr.prev;
    }
    else {
        curr.prev = curr.next;


    curr = curr.next;


    //for pushing the data into the node
    public static void push(int data) {
        Node newNode = new Node(new_data);

        newNode.next = head;
        newNode.prev = null; 
    
        if (head != null) {
            head.prev = newNode;
        }            
 
        head = newNode;
        }
}
}

public class DLLSwapping {
    public static void main(String[] args) {
        // TODO Auto-generated
        seperateNodes sn = new seperateNodes();
        sn.push(10);
        sn.push(2);
        sn.push(5);
        sn.push(12);
        sn.push(3);
        sn.push(15);

        System.out.println(sn);
        

    }
}