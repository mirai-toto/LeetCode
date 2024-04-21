package main.java.leetcode.solution;

import java.util.HashMap;

public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }

    public int[] twoSumSlow(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumThomas(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
                if (nums[n - i - 1] + nums[n - j - 1] == target) return new int[]{n - j - 1, n - i - 1};
            }
        }
        return new int[]{-1, -1};
    }
}