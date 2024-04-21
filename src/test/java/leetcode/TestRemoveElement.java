package test.java.leetcode;

import main.java.leetcode.solution.SolutionRemoveElement;
import main.java.leetcode.utils.StringToIntArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveElement {
    private final SolutionRemoveElement solution = new SolutionRemoveElement();

    private void testSolution(int[] nums, int[] expectedNums, int valueToRemove) {
        int expectedLength = solution.removeElement(nums, valueToRemove);
        assertEquals(expectedNums.length, expectedLength, STR."Number of value different of [\{valueToRemove}] is : \{expectedLength}");

        Arrays.sort(nums, 0, expectedLength);
        Arrays.sort(expectedNums, 0, expectedLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }

    private void testSolution(String nums, String expectedNums, int valueToRemove) {
        testSolution(StringToIntArrayUtil.convert(nums), StringToIntArrayUtil.convert(expectedNums), valueToRemove);
    }

    @Test
    public void test1() {
        testSolution("[3,2,2,3]", "[2,2]", 3);
    }

    @Test
    public void test2() {
        testSolution("[0,1,2,2,3,0,4,2]", "[0,1,4,0,3]", 2);
    }

    @Test
    public void test3() {
        testSolution("[3,3,3,3]", "[]", 3);
    }

    @Test
    public void test4() {
        testSolution("[]", "[]", 0);
    }
}
