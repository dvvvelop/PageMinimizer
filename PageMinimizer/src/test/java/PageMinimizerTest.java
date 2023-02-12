import static org.junit.jupiter.api.Assertions.*;

class PageMinimizerTest {
    PageMinimizer pageMinimizer;

    @org.junit.jupiter.api.Test
    void string1tostring2() {
    assertEquals("1-5,7,9-11", pageMinimizer.string1tostring2("3,2,5,1,4,9,11,7,10"));
    }
}