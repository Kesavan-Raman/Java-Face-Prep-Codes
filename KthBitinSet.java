import java.util.*;

class KthBitinSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[10];
        int idx = 0;
        
        while(num>=0) {
            arr[idx] = num%10;
            num = num/10;
            idx++;
        }

        for(int nums:arr) {
            System.out.println(nums);
        }
        
    }
    
}
