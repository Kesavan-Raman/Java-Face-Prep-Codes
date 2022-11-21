import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        for(int i=1; i<=row; i++) {
            for (int j=1; j <=i; j++) {
                System.out.print(j%2 +" ");
            }
            System.out.println();
        }
        s.close();
    }
    
}