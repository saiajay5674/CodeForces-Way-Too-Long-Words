import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {




    @Test
    void test1() 
    {
        assertEquals("l10n", Solution.shortenWord("localization"));
      
    }
    @Test
    void test2() 
    {
        assertEquals("word", Solution.shortenWord("word"));
      
    }
    @Test
    void test3() 
    {
        assertEquals("i18n", Solution.shortenWord("internationalization"));
      
    }
    @Test
    void test4() 
    {
        assertEquals("p43s", Solution.shortenWord("pneumonoultramicroscopicsilicovolcanoconiosis"));
      
    }

    

}
