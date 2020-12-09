public class Palindrome {
    public boolean isPalindrome(String word) {
        word = word.replaceAll("\\W","").toLowerCase();
        int start = 0;
        int end = word.length() - 1;
        while (end > start) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
