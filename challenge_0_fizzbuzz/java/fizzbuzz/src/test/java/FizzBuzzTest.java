import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzzOf1is1() {
        assertEquals(1, fizzbuzzOf(1));
    }

    @Test
    public void fizzbuzzOf2is2() {
        assertEquals(2, fizzbuzzOf(2));
    }

    private int fizzbuzzOf(int number) {
        return number;
    }

}
