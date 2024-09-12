public class Palindrome {
    public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
    String s = args[i];
        if (isPalindrome(s)){
            System.out.println(s + " палиндромом");
        } else {
            System.out.println(s + " не палиндромом");

        }
}
    }
    public static String reverseString(String s){
        int lengthString = s.length();
        String newString = "";
        for (int x = lengthString - 1; x >= 0; x--){
            newString = newString + s.charAt(x);
        }
        return newString;
    }
    public static boolean isPalindrome(String s){
        String s1 = s;
        String s2 = reverseString(s);
        return s1.equalsIgnoreCase(s2);
    }
    }