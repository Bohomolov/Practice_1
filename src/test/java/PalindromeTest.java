import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @Test
    public void test_isPalindrome_1(){
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean actual = palindrome.isPalindrome("aga");
        assertEquals(expected,actual);
    }
    @Test
    public void test_isPalindrome_2(){
        Palindrome palindrome = new Palindrome();
        boolean expected = false;
        boolean actual = palindrome.isPalindrome("agag");
        assertEquals(expected,actual);
    }
}
