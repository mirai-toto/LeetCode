package leetcode;

import leetcode.solution.SolutionValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestValidParentheses {

  private SolutionValidParentheses solutionValidParentheses;

  @BeforeEach
  void setUp() {
    this.solutionValidParentheses = new SolutionValidParentheses();
  }

  @Test
  void test1() {
    Assertions.assertTrue(solutionValidParentheses.isValid("()"));
  }

  @Test
  void test2() {
    Assertions.assertTrue(solutionValidParentheses.isValid("[({})]"));
  }

  @Test
  void test3() {
    Assertions.assertFalse(solutionValidParentheses.isValid("["));
  }

  @Test
  void test4() {
    Assertions.assertFalse(solutionValidParentheses.isValid("]"));
  }

  @Test
  void test5() {
    Assertions.assertTrue(solutionValidParentheses.isValid("()[]{}"));
  }

}
