import java.util.Scanner;
public class TestScanner{
    public static void main(String[] atgs){
        Scanner input = new Scanner(System.in);
        String temp = null;
        temp = input.nextLine();
        int tempLength = temp.length(); 
        System.out.println(temp);
        System.out.println(tempLength);
        System.out.println(temp[1]);
    }
}