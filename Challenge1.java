import java.util.Scanner;
public class Challenge1{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        String inputStr = "";
        inputStr = input.nextLine();

        String successiveIncrease = "";
        String longestIncrease = "";
        successiveIncrease += Character.toString(inputStr.charAt(0));
        for(int i = 0; i < inputStr.length() - 1; i++){
            if(inputStr.charAt(i+1) > inputStr.charAt(i)){
                successiveIncrease += Character.toString(inputStr.charAt(i+1));
            }
            else{
                if(successiveIncrease.length() > longestIncrease.length()){
                    longestIncrease = successiveIncrease;
                }
                successiveIncrease = "";
                successiveIncrease += Character.toString(inputStr.charAt(i+1));
            }
        }
        System.out.println(longestIncrease);
    }
}