import java.util.*;

public class MaxProdSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Total Elements in the Array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = 0;

        for(int i = 1; i<n; i++) {
            arr[i] = Math.max(arr[i], arr[i]*arr[i-1]);
            max = Math.max(arr[i], max);
        }

        System.out.println(max);
        
    }
}