import java.util.*;

class GreatestColumnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++)  {
            for(int j = 0; j < n; j++)  {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[n];
        int p = 0;

        for(int i = 0; i < n; i++)  {
            int temp = 0;
            for(int j = 0; j < n; j++)  {
                temp = arr[j][i];
                if(temp<=arr[j][i]) {
                    temp = arr[j][i];
                }
            }
            result[p] = temp;
                p++;    
        }

        for(int res:result) {
            System.out.print(res + " ");
        }
}        
        
}