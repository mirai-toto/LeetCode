package main.java.leetcode.solution;

public class SolutionLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        boolean common = true;
        int i = 0;
        Character c = null;

        while (common) {
            for (String s : strs) {
                if (i == s.length())
                    common = false;
                else if (c == null)
                    c = s.charAt(i);
                else if (c != s.charAt(i))
                    common = false;
            }
            if (common)
                sb.append(c);
            c = null;
            i++;
        }
        return sb.toString();
    }
}
