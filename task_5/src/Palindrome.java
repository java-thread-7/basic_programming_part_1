
/*
    Palindrome
    Kata palindrome adalah sebuah kata yang jika dibalik, tetap sama. Contoh, 'katak' dibalik tetaplah 'katak'.
    Buatlah sebuah program untuk mendeteksi sebuah string merupakan palindrome atau tidak.
*/

public class Palindrome {
    public static String isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("jika " + s + " dibalik " + reverse + ", maka ");
        if (s.equals(reverse)) {
            return "palindrome";
        }
        return "bukan palindrome";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("katak"));
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("account"));
    }
}