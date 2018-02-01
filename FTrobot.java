import java.sql.Array;
import java.util.*;

public class FTrobot{
    final int x = xinput;
    final int y = yinput;
    

    private static void solve(String FT){
        String[] FTS = FT.split("T");
        List<Integer> distance = new ArrayList();
        for(int i = 0; i < FTS.length; i++){
            distance.add(FTS[i].length());
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String FT = input.nextLine();
        int xinput = input.nextInt();
        int yinput = input.nextInt();
        input.close();
    }
}