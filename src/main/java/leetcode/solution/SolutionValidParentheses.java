package main.java.leetcode.solution;

import java.util.*;

public class SolutionValidParentheses {
    //(', ')', '{', '}', '[' and ']'

    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || c != brackets.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
