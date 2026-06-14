class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = "";

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        return cleaned.equals(reversed);
    }
}
