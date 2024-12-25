package leetcode;

import leetcode.solution.SolutionStrStr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

public class TestStrStr {
  private final SolutionStrStr solution = new SolutionStrStr();

  @Test
  public void test1() {
    String haystack = "sadbutsad";
    String needle = "sad";
    int expectedValue = 0;

    Assertions.assertEquals(expectedValue, solution.strStr(haystack, needle));
  }

  @Test
  public void test2() {
    String haystack = "leetcode";
    String needle = "leeto";
    int expectedValue = -1;

    Assertions.assertEquals(expectedValue, solution.strStr(haystack, needle));
  }

  @Test
  public void test3() {
    String haystack = "a";
    String needle = "a";
    int expectedValue = 0;

    Assertions.assertEquals(expectedValue, solution.strStr(haystack, needle));
  }

  @Test
  public void test4() {
    String haystack = "mississippi";
    String needle = "issip";
    int expectedValue = 4;

    Assertions.assertEquals(expectedValue, solution.strStr(haystack, needle));
  }

  public static String generateRandomString(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    SecureRandom random = new SecureRandom();
    StringBuilder sb = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
      int randomIndex = random.nextInt(characters.length());
      sb.append(characters.charAt(randomIndex));
    }

    return sb.toString();
  }

  @Test
  public void compare() {
    String haystack = generateRandomString(1000000);
    String needle = generateRandomString(4);
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    int myStrStrValue = solution.myStrStr(haystack, needle);
    endTime = System.nanoTime();
    long myStrStrDuration = (endTime - startTime) / 1_000_000;
    System.out.println("Execution time: " + myStrStrDuration + " ms, with value : " + myStrStrValue);

    startTime = System.nanoTime();
    int strStrValue = solution.myStrStr(haystack, needle);
    endTime = System.nanoTime();
    long strStrDuration = (endTime - startTime) / 1_000_000;
    System.out.println("Execution time: " + strStrDuration + " ms, with value : " + strStrValue);
  }
}
