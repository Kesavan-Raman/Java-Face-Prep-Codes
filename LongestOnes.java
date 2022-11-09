//write a program to print length of the longest conecutive ones 
//

import java.util.*;

public class LongestOnes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        int[] arr = new int[16];
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
