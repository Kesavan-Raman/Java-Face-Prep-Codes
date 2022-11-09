import java.util.*;
public class FindNRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element you want to find");
        int num = scan.nextInt();

        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        
    }

    public static int search(int a, int arr[], int num) {
        if(arr[a] == num)
        System.out.println("Element found");
        else 
         {
            int number = a--;
            
        return search(number , arr[], num);
         }

    }
}