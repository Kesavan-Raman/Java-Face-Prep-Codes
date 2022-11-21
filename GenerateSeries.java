import java.util.*;

public class GenerateSeries{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 9;
        arr[1] = 11;


        for(int i = 2; i < n; i++) {
            int temp = arr[i-1]+arr[i-2];
            arr[i] = temp;

    }

    for(int num:arr) {
        System.out.print(num+" ");

    }
}
}