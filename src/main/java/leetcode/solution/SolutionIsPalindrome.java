package main.java.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionIsPalindrome {
    public boolean isPalindrome(int x) {
        Deque<Integer> deque = new ArrayDeque<>();
        if (x<0)
            return false;
        while (x != 0) {
            deque.add(x%10);
            x/=10;
        }
        while (!deque.isEmpty()) {
            Integer firstElement = deque.pop();
            if (deque.isEmpty())
                return true;
            if (!firstElement.equals(deque.removeLast()))
                return false;
        }
        return true;
    }

    public boolean isPalindromeFast(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        if (x % 10 == 0)
            return false;
        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x/=10;
        }
        return (x == reversed) || (x == reversed / 10);
    }
}
