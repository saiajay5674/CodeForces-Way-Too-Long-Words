import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int n = 0;
        
        if (input.hasNextInt())
        {
            n = input.nextInt(); 
        }
        
        int i =0;
        
        while (i < n)
        {
            System.out.println(shortenWord(input.next()));
        }
        
        input.close();
            

    }
    
    public static String shortenWord(String word)
    {
        if (word.length() < 10)
        {
            return word;
        }
        else
        {
            String intLetters = word.substring(1, word.length() - 1);
            
            char nLetters = (char)intLetters.length();
            

            return ""+ word.charAt(0)+  nLetters + word.charAt(word.length()-1);
            
        }
    }

}
