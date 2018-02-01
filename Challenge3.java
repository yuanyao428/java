import java.util.Scanner;
public class Challenge3{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        String inputStr = "";
        inputStr = input.nextLine();
        int inputLength = inputStr.length(); 

        String samePart = "";
        String longestPart  = "";
        samePart += Character.toString(inputStr.charAt(0));
        for(int i = 0; i < inputLength - 1; i++)
        {
            if(inputStr.charAt(i+1) == inputStr.charAt(i)){
                samePart += Character.toString(inputStr.charAt(i+1));   
            }
            else{
                if(samePart.length() > longestPart.length()){
                    longestPart = "";
                    for(int j = 0; j < samePart.length(); j++){
                        longestPart += Character.toString(samePart.charAt(j));
                    }
                }
                samePart = "";
                samePart += Character.toString(inputStr.charAt(i+1));
            }
        }
        System.out.println(longestPart);
    }
}