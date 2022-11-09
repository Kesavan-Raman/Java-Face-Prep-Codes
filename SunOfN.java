import java.util.*;

public class SunOfN {
    public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
    int number = scan.nextInt();    
    int sum = sumOfN(number);
    System.out.println(sum);
}

public static int sumOfN(int num) {
    if (num != 0)
        return num + sumOfN(num - 1);
    else
        return num;
}
}