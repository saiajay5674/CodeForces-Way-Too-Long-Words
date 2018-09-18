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
            if (input.hasNext())
            {
                System.out.println(shortenWord(input.next()));
            }
            i = i + 1;
        }
        
        input.close();
            

    }
    
    public static String shortenWord(String word)
    {
        if (word.length() <= 10)
        {
            return word;
        }
        else
        {
            String intLetters = word.substring(1, word.length() - 1);
            
            String nLetters = ((Integer)intLetters.length()).toString();
            String firstLetter = ((Character)word.charAt(0)).toString();
            String lastLetter = ((Character)word.charAt(word.length()-1)).toString();
            String result = firstLetter + nLetters + lastLetter;
            

            return result;
            
        }
    }

}
