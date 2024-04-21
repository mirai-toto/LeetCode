package test.java.leetcode;

import main.java.leetcode.solution.SolutionRemoveDuplicates;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveDuplicates {
    private final SolutionRemoveDuplicates solution = new SolutionRemoveDuplicates();

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        int[] expectedNums = {1, 2, 3, 4, 5};
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testAllElementsSame() {
        int[] nums = {2, 2, 2, 2};
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        int[] expectedNums = {2}; // Only one element should remain.
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testSomeDuplicates() {
        int[] nums = {1, 1, 2, 3, 3};
        int k = solution.removeDuplicates(nums);
        assertEquals(3, k);
        int[] expectedNums = {1, 2, 3}; // The unique elements in their original order.
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    // Optional: Test with a large array to check for performance issues.
    @Test
    public void testLargeArray() {
        int size = 100000; // Example large size.
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i / 2; // This will create duplicates of every number.
        }
        int k = solution.removeDuplicates(nums);
        assertEquals(size / 2, k); // Expect half the size because every element is duplicated once.
        for (int i = 0; i < k; i++) {
            assertEquals(i, nums[i]);
        }
    }

}
