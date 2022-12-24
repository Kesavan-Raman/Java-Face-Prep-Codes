import java.util.*;

class ChineaseRemainderTheorem{
    public static void main(String[] args) {
        int[] num = {3, 4, 5};
        int[] rem = {2, 3, 1};
        int X = 1;
        int i = 0;
        while(true) {
            for(i = 0; i<num.length; i++) {
            if(X%num[i] != rem[i]) {
                break;
            }            
        }
        if(i == num.length) {
                System.out.println(X);
                break;
            }
        X++;
        }
    }
}