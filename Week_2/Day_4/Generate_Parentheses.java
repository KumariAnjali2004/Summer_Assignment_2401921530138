import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", 2 * n, result);
        return result;
    }

    private void generate(String curr, int max, List<String> result) {
        if (curr.length() == max) {
            if (isValid(curr)) {
                result.add(curr);
            }
            return;
        }

        generate(curr + "(", max, result);
        generate(curr + ")", max, result);
    }

    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
