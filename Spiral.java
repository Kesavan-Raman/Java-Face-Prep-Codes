import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n]; 

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        int rowBegin = 0; 
        int rowEnd = arr.length -1;
        int colBegin = 0;
        int colEnd = arr[0].length -1;
        
        //logic here...
        
        
        

        











        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.println(arr[i][j]);
            }
        }

        scan.close();
        
    }
}