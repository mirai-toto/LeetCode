import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestIsPalindrome {
    private SolutionIsPalindrome solutionIsPalindrome;

    @BeforeEach
    void setUp() {
        this.solutionIsPalindrome = new SolutionIsPalindrome();
    }

    @Test
    void test1() {
        assertTrue(solutionIsPalindrome.isPalindrome(121));
    }
    @Test
    void test2() {
        assertFalse(solutionIsPalindrome.isPalindrome(-121));
    }
    @Test
    void test3() {
        assertFalse(solutionIsPalindrome.isPalindrome(10));
    }
    @Test
    void test4() {
        assertTrue(solutionIsPalindrome.isPalindromeFast(747));
        assertTrue(solutionIsPalindrome.isPalindromeFast(7487847));
        assertTrue(solutionIsPalindrome.isPalindromeFast(0));
        assertTrue(solutionIsPalindrome.isPalindromeFast(10));
    }
}