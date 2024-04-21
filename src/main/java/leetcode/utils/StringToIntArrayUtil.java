package main.java.leetcode.utils;

import java.util.stream.Stream;

public class StringToIntArrayUtil {

    public static int[] convert(String str) {
        return Stream.of(str.substring(1, str.length() - 1).split(","))
                .filter(s -> s.matches("^-?\\d+$"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    private StringToIntArrayUtil() {}
}
