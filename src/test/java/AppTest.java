import org.junit.Test;
import  static org.junit.Assert.assertEquals;

public class AppTest {

    String input1 = "noon";
    App app = new App();
    boolean expected = true;

    @Test
    public void isPalindromeTest(){
        assertEquals(expected, app.isPalindrome(input1));
    }

    @Test
    public void isNotPalindromeTest(){
        assertEquals(false, app.isPalindrome("abc"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void isNotPalindromeExceptionTest(){
        assertEquals(false, app.isPalindrome(null));

    }

}
