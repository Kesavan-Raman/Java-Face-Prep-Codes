import java.util.*;

class SimpleSeiveAlgorithm {
    public static void main(String[] args){
        int n = 1000;
        boolean[] b = new boolean[n];
        for (int i = 2; i < n; i++){
            b[i] = true;
        }

        for(int i = 2; i*i<n; i++){
            if(b[i] == true) {
                for(int j = i+i; j < n; j= i+j){
                    b[j] = false;
            }
        }
    }

    for(int i = 2; i<n; i++){
        if(b[i] == true) {
            System.out.print(i+" ");
    }
}
}
}