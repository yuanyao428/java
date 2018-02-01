import java.util.*;

public class DFSDEMO{
    final int h = 4;
    final int w = 5;
    int[][] dp = new int[h + 1][w +1];
    void calc(){
        int i, j;
        dp[0][0] = 1;
        for(i = 0; i <= h; i++){
            for(j =0; j <= w; j++){
                if(i != 0) dp[i][j] += dp[i - 1][j];
                if(j != 0) dp[i][j] += dp[i][j - 1];
            }
        }
        System.out.print(dp[4][5]);
    }
    public static void main(String[] args){
        DFSDEMO demo = new DFSDEMO();
        demo.calc();
    }
}