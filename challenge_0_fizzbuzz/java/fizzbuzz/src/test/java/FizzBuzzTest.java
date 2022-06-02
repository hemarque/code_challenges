import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzzOf1is1() {
        assertEquals("1", fizzbuzzOf(1));
    }

    @Test
    public void fizzbuzzOf2is2() {
        assertEquals("2", fizzbuzzOf(2));
    }

    @Test
    public void fizzbuzzOf3isFizz() {
        assertEquals("Fizz", fizzbuzzOf(3));
    }

    private String fizzbuzzOf(int number) {
        String fizzbuzz;
        if(number == 3){
            fizzbuzz = "Fizz";
        }else{
            fizzbuzz = number + "";
        }
        return fizzbuzz;
    }

}
