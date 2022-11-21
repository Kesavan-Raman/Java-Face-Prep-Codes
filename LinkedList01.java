import java.util.*;
public  class linkedList01 {
    public static Node head = null; 
    class Node {
        
        int data;
        Node next;
        Node(int data) {
            this.data = data;    
            this.next = null;  
        }

    }

    public void insert(Node node, int d) {

        if(head == null) {
            head = node;
        }
        else {
            Node n1 = head;
            while(n1.next != null) {
                n1 = n1.next;
            }
            n1.next = node;
        }
    }
    
    public static void main(String[] args) {

        Llinsertion obj = new Llinsertion();
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            Node node = obj.new Node(x);
            obj.insert(node, x);
        }

        s.close();
        Node start = head;
        
        while(start != null) {
            System.out.println(start.data);
            start = start.next;
        }
        
    }

}