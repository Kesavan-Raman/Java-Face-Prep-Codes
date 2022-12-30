import java.util.*;

class HourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int max = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        for(int i = 0; i < r-2; i++) {
            for(int j = 0; j < c-2; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                // max = Math.max(sum, max);

                if(sum > max){
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("start: " + start + " end: " + end);
        System.out.println(arr[i][j] +" "+ arr[i][j+1] +" "+ arr[i][j+2] +" "+ arr[i+1][j+1] +" "+ arr[i+2][j] +" "+ arr[i+2][j+1] +" "+ arr[i+2][j+2]);
        System.out.println(sum);


    }
}