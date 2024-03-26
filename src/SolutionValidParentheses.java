import java.util.*;

public class SolutionValidParentheses {
    //(', ')', '{', '}', '[' and ']'

    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                queue.push(c);
            } else if (c == ')') {
                if (queue.isEmpty() || queue.pop() != '(')
                    return false;
            } else if (c == '}') {
                if (queue.isEmpty() || queue.pop() != '{')
                    return false;
            } else {
                if (queue.isEmpty() || queue.pop() != '[')
                    return false;
            }
        }
        return queue.isEmpty();
    }
}
