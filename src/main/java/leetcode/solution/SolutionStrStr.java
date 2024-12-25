package leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class SolutionStrStr {

    public int myStrStr(String haystack, String needle) {
        Map<Integer, Integer> data = new HashMap<>();
        int length = needle.length();
        if (length == 0)
            return 0;

        char first = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == first)
                data.put(i, 1);

            var iterator = data.entrySet().iterator();
            while (iterator.hasNext()) {
                var entry = iterator.next();
                Integer index = entry.getKey();
                Integer count = entry.getValue();

                if (haystack.charAt(i) == needle.charAt(i - index)) {
                    if (count == length)
                        return index;
                    entry.setValue(count + 1);
                } else {
                    iterator.remove();
                }
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
