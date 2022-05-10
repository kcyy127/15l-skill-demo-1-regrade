import static org.junit.Assert.*;

import org.junit.*;

public class Tests {

    @Test
    public void testNaturalNumber() {
        assertEquals(6, Factorial.factorial(3));
    }
}