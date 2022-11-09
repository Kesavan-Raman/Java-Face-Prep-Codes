import java.util.*;

public class GreatestCommonDivison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int ans = gcd(a, b);
        System.out.println(ans);
    }
    public static int gcd(int a, int b) {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}