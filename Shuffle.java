import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        }


        int[] nums = new int[n];
        for(int j = 0; j<n; j++) {
            for(int i = 0; i<n-1; i++) {
                if(i%2 ==0) {
                    if(arr[i]>0) {
                        nums[i] = arr[i];
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
                if(i%2 != 0) {
                    if(arr[i]<0) {
                        nums[i] = arr[i];
                    }
                    // else {
                    //     int temp = arr[i];
                    //     arr[i] = arr[i+1];
                    //     arr[i+1] = temp;
                    // }
                }
        }

        }

        for(int var:nums) {
            System.out.print(var+" ");
        }
       
        














        scan.close();
    }
}