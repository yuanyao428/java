import java.util.*;

public class Palindrome{

   private void JudgePalindrome(String palindrome){
       int[] count = new int[26];
       for(int i = 0; i < palindrome.length(); i++){
           for(char j = 'a'; j <= 'z'; j++){
               if(palindrome.charAt(i) == j) count[(int)j - 97] ++;
           }   
       }
       int countOdd = 0;
       int judge = 0;
       for(int i = 0; i < 26; i++){
           if(count[i] % 2 != 0) countOdd ++;
       }
       if(countOdd > 1) judge = 1;
       System.out.println(judge);
   }

    public static void main(String[] args){
        Palindrome myPalindrome = new Palindrome();
        myPalindrome.JudgePalindrome((new Scanner(System.in)).nextLine());
    }
}