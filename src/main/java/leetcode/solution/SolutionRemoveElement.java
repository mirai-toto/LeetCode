package main.java.leetcode.solution;

public class SolutionRemoveElement {
    public int removeElementShort(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }


    public int removeElement(int[] nums, int valueToRemove) {
        int i = 0;
        int last = nums.length - 1;
        while (true) {
            if (last >= 0 && nums[last] == valueToRemove) {
                last--;
                continue;
            }
            if (i >= last)
                return last + 1;
            if (nums[i] == valueToRemove) {
                nums[i] = nums[last];
                last--;
            }
            i++;
        }
    }
}
