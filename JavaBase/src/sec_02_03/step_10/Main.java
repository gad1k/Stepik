package sec_02_03.step_10;

public class Main {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        return sb.toString().equals(sb.reverse().toString());
    }
}