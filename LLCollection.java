import java.util.*;
public class LLCollection {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements you want to read");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int ele = scan.nextInt();
            ll.add(ele);
        }
        scan.close();
        System.out.println(ll);
}
}