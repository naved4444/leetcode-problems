class Solution {
    public boolean isPalindrome(String s) {   
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        s = sb.toString();
        return check_palindrome(s, 0);
    }
    private static boolean check_palindrome(String s, int i)
    {
        if(i>=s.length()/2)
            return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        return check_palindrome(s, i+1);
    }
}