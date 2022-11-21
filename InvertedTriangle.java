import java.util.*;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number = 1;
        String space = " ";
 
        for (int i = 0; i < n; i++) {
            for(int j = n; j > i; j--) {
                if(number<=(n*n+1)) {
                    System.out.print(number+"*");
                    number++;
                }
        }
        System.out.print(" ");
        System.out.println(space);
    }
}
}