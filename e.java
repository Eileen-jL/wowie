public class Reverser {
    // @param word a string
    //return a string consisting of the characters if word in reverse order
    public static String reverseword(String word) {
        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.substring(i,i + 1);
        }
        return reversed;
    }
    //@param word a string
    //@return true if word is a palindrome, false otherwise
    public static boolean isPalindrome(String word) {
        String reversed = reverseWord(word);
        return word.equalsIgnoreCase(reversed);
    }
}
