import java.util.*;

class LeaderArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int size = scan.nextInt();
        int[] arr = {12, 15, 10, 9, 7, 8, 3, 4};

        System.out.print(arr[arr.length -1] + " ");
        int prev = arr[arr.length-1];

        for(int i = arr.length - 2; i >= 0; i--) {            
            // int new = arr[i];
            if(arr[i] > prev) {
                prev = arr[i];
                System.out.print(arr[i] + " ");
            }
            
        }

    }
}