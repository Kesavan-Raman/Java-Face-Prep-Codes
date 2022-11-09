// Java program to check if k-th bit
// of a given number is set or not
import java.util.*;
 
class KBS {
    public static void isKthBitSet(int n, int k)
    {
        if ((n & (1 << (k - 1))) > 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }
 
    // Driver code
    public static void main(String[] args)
    {
        //int n = 5, k = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        System.out.println("Enter the K th Value");
        int k = scan.nextInt();
 
        // Function call
        isKthBitSet(n, k);
    }
}