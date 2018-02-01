import java.util.Scanner;
public class Challenge22{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        String inputStr = "";
        inputStr = input.nextLine();

        String samePart = "";
        String longestPart  = "";
        samePart += Character.toString(inputStr.charAt(0));
        for(int i = 0; i < inputStr.length() - 1; i++)
        {
            if(inputStr.charAt(i+1) == inputStr.charAt(i)){
                samePart += Character.toString(inputStr.charAt(i+1));   
            }
            else{
                if(samePart.length() > longestPart.length()){
                    longestPart = samePart;
                }
                samePart = "";
                samePart += Character.toString(inputStr.charAt(i+1));
            }
        }
        if(samePart.length() > longestPart.length()){
            longestPart = samePart;
        }
        sameL(inputStr, longestPart);
    }

    public static void sameL(String inStr, String longest){
        String sameLength = "";
        sameLength += Character.toString(inStr.charAt(0));
        for(int j = 0; j < inStr.length() - 1; j++){
            if(inStr.charAt(j+1) == inStr.charAt(j)){
                sameLength += Character.toString(inStr.charAt(j+1));
            }
            else{
                if(sameLength.length() == longest.length()){
                    System.out.println(sameLength);
                }
                sameLength = "";
                sameLength += Character.toString(inStr.charAt(j+1));
            }
        }
        if(sameLength.length() == longest.length()){
            System.out.println(sameLength);
        }
    }
}