//binary palindrome
import java.util.*;

public class BinaryPalindrome {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        String x = "";

        while(num > 0)
        {
            int a = num % 2;
            x = a + x;
            num = num / 2;
        }
        //now x holds the binary value
        char[] arr = x.toCharArray();
        int p1 = 0;
        int p2 = arr.length-1;
        int cond = arr.length-1;
        int count = 0;
        
        while(cond-->=0) {
            if(arr[p1] == arr[p2]) {
                ++p1;
                --p2;
                count++;
            }

            
        }
        if(count == cond-1) {
            System.out.println("Given Number is Palindrome in binary");
        }
        else
        System.out.println("Not a palindrome in binary");
        
    }
}