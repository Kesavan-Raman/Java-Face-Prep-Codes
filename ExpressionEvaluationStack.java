import java.util.*;

public class ExpressionEvaluationStack {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] word_tokens = word.toCharArray();

        Stack<Integer> value = new Stack<Integer>();
        Stack<Character> chars = new Stack<Character>();

        int result = 0;

        for(int i = 0; i<word_tokens.length; i++){
            if (word_tokens[i] >= '0' && word_tokens[i] <= '9') {
                value.push(word_tokens[i]);
            }
            else if(word_tokens[i] == "(" || word_tokens[i] == ")" || word_tokens[i] == "*" || word_tokens[i] == "+" || word_tokens[i] == "-" || word_tokens[i] == "*") {
                chars.push(word_tokens[i]);
            }

            System.out.println(value);
            System.out.println(chars);

    }
}
}
