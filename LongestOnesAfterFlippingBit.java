import java.util.*;

class LongestOnesAfterFlippingBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        int a = 110011;

        int curr = 0;
        int prev = 0;
        int max = 0;

        while(a>0) {
            if(a&1 == 1) {
                curr++;
            }

            else {
                prev = (a&2) == 0?0:curr;
        }
        max = Math.max(max, prev);
        a>>=1;
    }

    System.out.println(max+1);
}
}