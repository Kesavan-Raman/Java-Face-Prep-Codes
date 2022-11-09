import java.util.*;

public class AnagramSort
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();

        if(s.length() != t.length()) {
            System.out.println("NO");
        }

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            if(sarr[i] == tarr[i]) {
                count++;
            }
        }

        if(count == s.length()) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        

		
	}
}
