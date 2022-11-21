import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 4;



        for(int i = 1; i < n; i++) {
            int square = (int) Math.pow(i, 2);
            arr[i] = arr[i-1]+square;


        }

    for(int num:arr) {
        System.out.print(num+" ");

    }
}
}