import java.util.Scanner;
public class Challenge111{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        String inputStr = "";
        inputStr = input.nextLine();
        sIncrease(inputStr);
    }


    public static void sIncrease(String inStr){
        String successiveIncrease = "";
        String longestIncrease = "";
        successiveIncrease += Character.toString(inStr.charAt(0));
        for(int i = 0; i < inStr.length() - 1; i++){
            if(inStr.charAt(i+1) > inStr.charAt(i)){
                successiveIncrease += Character.toString(inStr.charAt(i+1));
            }
            else{
                if(successiveIncrease.length() > longestIncrease.length()){
                    longestIncrease = successiveIncrease;
                }
                successiveIncrease = "";
                successiveIncrease += Character.toString(inStr.charAt(i+1));
            }
        }
        if(successiveIncrease.length() > longestIncrease.length()){
            longestIncrease = successiveIncrease;
        }

        sameLength(inStr, longestIncrease);       
    }

    public static void sameLength(String inStr, String longest){
        String sameLength = "";
        sameLength += Character.toString(inStr.charAt(0));
        for(int j = 0; j < inStr.length() - 1; j++){
            if(inStr.charAt(j+1) > inStr.charAt(j)){
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