import java.util.*;

class Node {
    int data;
    int 

}

public class StackLL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  

        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. isEmpty");
        System.out.println("4. size");
        System.out.println("5. topElement");
        System.out.println("6. display");

        Stack st = new Stack(); 
    
        int caseNum = scan.nextInt();
        switch(caseNum) {
            case caseNum: st.push(); break;
            case caseNum: st.pop(); break;
            case caseNum3: st.isEmpty(); break;
            case caseNum: st.size(); break;
            case caseNum: st.topElement(); break;
            case caseNum: st.display(); break;
            default: System.out.println("Please enter a valid Input"); break;
        }

    }
}