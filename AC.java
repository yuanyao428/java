import java.util.Scanner;
public class AC{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        print(Str);
    }
    private static int Search(String in){
        int result = in.indexOf("AC");
        return result;
    }
    private static void print(String inPut){
        if(Search(inPut) != -1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No--Azure Boards Feature");
        }
    }
}
