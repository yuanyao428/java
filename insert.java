import java.util.Scanner;

public class insert
{
    public static void main(String[] args)
    {
        System.out.println(insertX((new Scanner(System.in)).nextLine() ));
    }
    private static int insertX(String prePalindrome)
    {
        int start = 0;
        int end = prePalindrome.length() - 1;
        int countx = 0;
        while (start < end)
        {
            char s = prePalindrome.charAt(start);
            char e = prePalindrome.charAt(end);
            if (s != e)
            {
                countx++;
                if (s == 'x')
                {
                    start++;
                }
                else if (e == 'x')
                {
                    end--;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                start++;
                end--;
            }
        }
        return countx;
    }
}
