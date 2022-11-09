import java.util.*;

public class Anagram
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();

        if(s.length() != t.length()) {
            System.out.println("NO");
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map1.containsKey(ch)) {
                map1.put(ch, ch.getKey(ch)+1);
            }
            else
            map1.put(ch, 1);
        }

        for(int i = 0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map2.containsKey(ch)) {
                map2.put(ch, ch.getKey(ch)+1);
            }
            else
            map2.put(ch, 1);
        }

        for(int val:map)



		
	}
}
