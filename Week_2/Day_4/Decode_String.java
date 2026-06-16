class Solution {
    int i = 0;

    public String decodeString(String s) {
        return helper(s);
    }

    private String helper(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                i++;
                String inner = helper(s);
                for (int k = 0; k < num; k++) {
                    result.append(inner);
                }
                num = 0;
            } else if (c == ']') {
                return result.toString();
            } else {
                result.append(c);
            }
            i++;
        }

        return result.toString();
    }
}
