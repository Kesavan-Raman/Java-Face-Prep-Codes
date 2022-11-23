import java.util.*;

class Main {

    Set<Character> set = new HashSet<Character>();
    
    //String vowels = "aeiou";
    char[] carr = {'a', 'e', 'i', 'o', 'u'};
    
    for(char c: carr) {
        set.add(c);
    }
    
    // set.add('a');
    // set.add('e');
    // set.add('i');
    // set.add('o');
    // set.add('u');

    Scanner scan  = new Scanner(System.in);
    String str = scan.nextLine();

    String[] tokens = str.split(" ");

    s1 = tokens[0];
    s2 = tokens[1];
    s3 = tokens[2];

    for (int i = 0; i < s1.length(); i++) {
        char ch = s1.charAt(i);
        if (set.contains(ch)) {
            s1.replace(ch, "#");
        }
    }

    System.out.println(s1);


    
}