import java.util.*;

public class ProdExclu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] result = new int[n];
        int prod = 1;
        for(int p:arr) {
            prod = prod*p;
        }

        for(int i = 0; i<n; i++) {
            result[i] = prod/arr[i];
        }

        for(int val:result) {
            System.out.print(val);
        }
        
    }
}