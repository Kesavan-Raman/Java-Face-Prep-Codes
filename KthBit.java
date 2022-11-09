import java.util.*;
class KthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        while(n >= 0) {
            int temp = n % 2;
	       l.add(temp);
	       n = n / 2;
	    }
	    int len = l.size();
	    for(int i=0; i<len; i++)
	        System.out.println(l.get(i));
    }
}