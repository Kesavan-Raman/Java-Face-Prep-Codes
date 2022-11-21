import java.util.*;

public class MangoTree {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int row = s.nextInt();
    int col = s.nextInt();
    int num = s.nextInt();
    if(num <= row && num >= 1)
        System.out.println("Yes");
    else if(num % row == 0  || num % row == 1)
        System.out.println("Yes");
    else 
        System.out.println("No");
 }  
}