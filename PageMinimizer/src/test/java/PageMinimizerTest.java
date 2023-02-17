import org.example.PageMinimizer;

import static org.junit.jupiter.api.Assertions.*;

class PageMinimizerTest {
    PageMinimizer pageMinimizer;

    @org.junit.jupiter.api.Test
    void comma() {
       assertEquals("1,5", pageMinimizer.string1tostring2("5,1"));
    }
    @org.junit.jupiter.api.Test
    void hyphen() {
        assertEquals("1-6", pageMinimizer.string1tostring2("2,5,4,3,1,6"));
        }
    @org.junit.jupiter.api.Test
    void comma_and_hyphen() {
        assertEquals("1-5,7", pageMinimizer.string1tostring2("3,1,4,2,5,7"));
    }
    @org.junit.jupiter.api.Test
    void comma_and_doubleHyphen() {
        assertEquals("1-5,7,9-11", pageMinimizer.string1tostring2("3,1,4,2,5,10,7,9,11"));
    }
    @org.junit.jupiter.api.Test
    void singleNumber() {
        assertEquals("7", pageMinimizer.string1tostring2("7"));
    }
    @org.junit.jupiter.api.Test
    void zero() {
        assertEquals("0,0", pageMinimizer.string1tostring2("0,0"));
    }
    @org.junit.jupiter.api.Test
    void negative_value() {
        assertEquals("-4,1,3", pageMinimizer.string1tostring2("1,-4,3"));
    }
    @org.junit.jupiter.api.Test
    void negative_value_dash() {
        assertEquals("-4--2,1-3", pageMinimizer.string1tostring2("-4,-3,-2,1,2,3"));
    }
    @org.junit.jupiter.api.Test
    public void test_symbolException() {
        boolean thrown = false;

        try {
            pageMinimizer.string1tostring2("абв");
        } catch (java.lang.NumberFormatException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
    @org.junit.jupiter.api.Test
    public void test_dotException() {
        boolean thrown = false;

        try {
            pageMinimizer.string1tostring2("1.4");
        } catch (java.lang.NumberFormatException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @org.junit.jupiter.api.Test
    public void test_emptyException () {
        boolean thrown = false;

        try {
            pageMinimizer.string1tostring2("");
        } catch (java.lang.NumberFormatException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

}