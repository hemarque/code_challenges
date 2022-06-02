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

    @Test
    public void fizzbuzzOf5isBuzz() {
        assertEquals("Buzz", fizzbuzzOf(5));
    }

    @Test
    public void fizzbuzzOf6isFizz() {
        assertEquals("Fizz", fizzbuzzOf(6));
    }

    @Test
    public void fizzbuzzOf10isBuzz() {
        assertEquals("Buzz", fizzbuzzOf(10));
    }

    @Test
    public void fizzbuzzOf15isFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzzOf(15));
    }

    @Test
    public void fizzbuzzOf30isFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzzOf(30));
    }

    private String fizzbuzzOf(int number) {
        String fizzbuzz = "";
        if(isMultipleOf3(number)){
            fizzbuzz += "Fizz";
        }
        if(isMultipleOf5(number)){
            fizzbuzz += "Buzz";
        }
        if(!isMultipleOf3(number) &&!isMultipleOf5(number)){
            fizzbuzz += number;
        }
        return fizzbuzz;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

}
