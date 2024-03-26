import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRomanToInteger {

    private SolutionRomanToInteger solutionRomanToInteger;

    @BeforeEach
    void setUp() {
        this.solutionRomanToInteger = new SolutionRomanToInteger();
    }

    @Test
    void test1() {
        assertEquals(3, solutionRomanToInteger.romanToInt("III"));
    }
    @Test
    void test2() {
        assertEquals(58, solutionRomanToInteger.romanToInt("LVIII"));
    }

    @Test
    void test3() {
        assertEquals(1994, solutionRomanToInteger.romanToInt("MCMXCIV"));
    }
}