import java.util.Scanner;
import java.util.Arrays;
public class NRE{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] b = new int[N];
        for(int i = 0; i < N; i++){
            b[i] = input.nextInt();
        }
        int Q = input.nextInt();
        int[][] L = new int[Q][2];
        for(int i = 0; i < Q; i++){
            for(int j = 0; j < 2; j++){
                L[i][j] = input.nextInt();
            }
        }
        int[] a = new int[N]; 
        for(int i = 0; i < N; i++){
            a[i] = 0;
        }
        System.out.println(upDate(N, a, b, L));
    }
    private static int upDate(int N, int[] a, int[] b, int[][] L){
        int temp[] = a;
        for(int i = 0; i < L.length; i++){
            int start = L[i][0];
            int end = L[i][1];
            int countZero = 0;
            int countOne = 0;
            if(start == end){
                if(b[start-1] == 0){
                    countZero++;
                }
                else{
                    countOne++;
                }
            }
            else{
                for(int j = start - 1; j < end - 1; j++){
                    if(b[j] == 0){
                        countZero++;
                    }
                    else{
                        countOne++;
                    }
                }
            }
            if(countOne > countZero){
                if(start == end){
                    temp[start-1] = 1;
                }
                else{
                    for(int j = start - 1; j < end - 1; j++){
                        temp[j] = 1;
                    }
                }  
            }
        }
        int compare = 0;
        for(int i = 0; i < N; i++){
            if(temp[i] != b[i]){
                compare++;
            }
        }
        return compare;
    }
}