package leetcode;

import leetcode.solution.SolutionTwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BiFunction;

public class TestTwoSum {
  public static final int SIZE = 150000;
  public static final int SEED = 420;
  private BiFunction<int[], Integer, int[]> twoSumSlow;
  private BiFunction<int[], Integer, int[]> twoSum;
  private BiFunction<int[], Integer, int[]> testedFunction;
  private BiFunction<int[], Integer, int[]> twoSumThomas;

  private int target;
  private int[] nums;

  private void setNumberList(Random rand) {
    List<Integer> list = new ArrayList<>();
    int size = SIZE;
    for (int i = 0; i < size; i++) {
      int nb = rand.nextInt(size);
      list.add((nb + nb % 2) + 1);
    }

    // Make first and second max unique
    int firstMaxIndex = list.indexOf(Collections.max(list));

    int firstMax = list.get(firstMaxIndex);
    list.set(firstMaxIndex, 0);

    int secondMaxIndex = list.indexOf(Collections.max(list));
    list.set(firstMaxIndex, firstMax + 3);
    list.set(secondMaxIndex, list.get(secondMaxIndex) + 2);

    this.nums = list.stream().mapToInt(Integer::intValue).toArray();
    this.target = this.nums[firstMaxIndex] + this.nums[secondMaxIndex];
    System.out.println("First number : " + this.nums[firstMaxIndex] + "; Second number " + this.nums[secondMaxIndex]);
  }

  @BeforeEach
  public void setUp() throws Exception {
    this.twoSum = new SolutionTwoSum()::twoSum;
    this.twoSumSlow = new SolutionTwoSum()::twoSumSlow;
    this.twoSumThomas = new SolutionTwoSum()::twoSumThomas;
    this.testedFunction = this.twoSum;

    Random rand = new Random(SEED); // Seed for reproducibility
    setNumberList(rand);
  }

  @Test
  public void test1() {
    int[] result = testedFunction.apply(new int[] { 2, 7, 11, 15 }, 9);
    int[] expected = new int[] { 0, 1 };
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] result = testedFunction.apply(new int[] { 3, 2, 4 }, 6);
    int[] expected = new int[] { 1, 2 };
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] result = testedFunction.apply(new int[] { 3, 3 }, 6);
    int[] expected = new int[] { 0, 1 };
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void test4() {
    int[] result = testedFunction.apply(new int[] { 3, 7, 2, 4, 9 }, 11);
    int[] expected = new int[] { 1, 3 };
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void testSlow() {
    int[] expectedResult = new int[] { 45994, 127061 };
    int[] resultSlow = this.twoSumSlow.apply(this.nums, this.target);
    System.out.println("resultSlow : " + Arrays.toString(resultSlow) + " => { " + this.nums[resultSlow[0]] + ", "
        + this.nums[resultSlow[1]] + " }");
    Assertions.assertArrayEquals(expectedResult, resultSlow);
  }

  @Test
  public void testFast() {
    int[] expectedResult = new int[] { 45994, 127061 };
    int[] resultFast = this.twoSum.apply(this.nums, this.target);
    System.out.println("resultFast : " + Arrays.toString(resultFast) + " => { " + this.nums[resultFast[0]] + ", "
        + this.nums[resultFast[1]] + " }");
    Assertions.assertArrayEquals(expectedResult, resultFast);
  }

  @Test
  public void testThomas() {
    int[] expectedResult = new int[] { 45994, 127061 };
    int[] resultFast = this.twoSumThomas.apply(this.nums, this.target);
    System.out.println("resultFast : " + Arrays.toString(resultFast) +
        " => { " + this.nums[resultFast[0]] + ", " + this.nums[resultFast[1]] + " }");
    Assertions.assertArrayEquals(expectedResult, resultFast);
  }
}
