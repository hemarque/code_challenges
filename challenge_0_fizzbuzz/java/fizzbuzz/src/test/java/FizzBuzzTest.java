import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void fizzbuzzOf1is1() {
        assertEquals("1", fizzbuzz.fizzbuzzOf(1));
    }

    @Test
    public void fizzbuzzOf2is2() {
        assertEquals("2", fizzbuzz.fizzbuzzOf(2));
    }

    @Test
    public void fizzbuzzOf3isFizz() {
        assertEquals("Fizz", fizzbuzz.fizzbuzzOf(3));
    }

    @Test
    public void fizzbuzzOf5isBuzz() {
        assertEquals("Buzz", fizzbuzz.fizzbuzzOf(5));
    }

    @Test
    public void fizzbuzzOf6isFizz() {
        assertEquals("Fizz", fizzbuzz.fizzbuzzOf(6));
    }

    @Test
    public void fizzbuzzOf10isBuzz() {
        assertEquals("Buzz", fizzbuzz.fizzbuzzOf(10));
    }

    @Test
    public void fizzbuzzOf15isFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzzOf(15));
    }

    @Test
    public void fizzbuzzOf30isFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzzOf(30));
    }

    @Test
    public void fizzbuzzOf100FirstIntegers() {
        String expected = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "Fizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "28\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "Buzz\n" +
                "Fizz\n" +
                "37\n" +
                "38\n" +
                "Fizz\n" +
                "Buzz\n" +
                "41\n" +
                "Fizz\n" +
                "43\n" +
                "44\n" +
                "FizzBuzz\n" +
                "46\n" +
                "47\n" +
                "Fizz\n" +
                "49\n" +
                "Buzz\n" +
                "Fizz\n" +
                "52\n" +
                "53\n" +
                "Fizz\n" +
                "Buzz\n" +
                "56\n" +
                "Fizz\n" +
                "58\n" +
                "59\n" +
                "FizzBuzz\n" +
                "61\n" +
                "62\n" +
                "Fizz\n" +
                "64\n" +
                "Buzz\n" +
                "Fizz\n" +
                "67\n" +
                "68\n" +
                "Fizz\n" +
                "Buzz\n" +
                "71\n" +
                "Fizz\n" +
                "73\n" +
                "74\n" +
                "FizzBuzz\n" +
                "76\n" +
                "77\n" +
                "Fizz\n" +
                "79\n" +
                "Buzz\n" +
                "Fizz\n" +
                "82\n" +
                "83\n" +
                "Fizz\n" +
                "Buzz\n" +
                "86\n" +
                "Fizz\n" +
                "88\n" +
                "89\n" +
                "FizzBuzz\n" +
                "91\n" +
                "92\n" +
                "Fizz\n" +
                "94\n" +
                "Buzz\n" +
                "Fizz\n" +
                "97\n" +
                "98\n" +
                "Fizz\n" +
                "Buzz\n";
        assertEquals(expected, fizzbuzz.getFirst100FizzBuzz());
    }

}
