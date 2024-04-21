package main.java.leetcode.solution;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static main.java.leetcode.utils.RomanToIntegerUtils.getRomanNumeralValue;

public class SolutionRomanToInteger {

    // This function handles IIIX as 7 and IIIIX as 6
    public int romanToInt(@NotNull String s) {
        int value = 0;
        int count = 0;

        int previousValue = getRomanNumeralValue(s.charAt(0));
        int currentValue;

        for (int i = 0; i < s.length(); i++) {
            currentValue = getRomanNumeralValue(s.charAt(i));

            if (previousValue == currentValue)
                count++;
            else if (previousValue < currentValue) {
                currentValue -= previousValue * count;
                previousValue = currentValue;
                count = 1;
            } else {
                value += previousValue * count;
                count = 1;
                previousValue = currentValue;
            }
        }
        value += previousValue * count;
        return value;
    }

    public int romanToIntPub(@NotNull String s) {
        Map<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            // Current number is not the last, and next number is actually bigger than current number, so we subtract
            if (i < s.length() - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1)))
                ans -= romanValues.get(s.charAt(i));
            else
                ans += romanValues.get(s.charAt(i));
        }
        return ans;
    }
}
