public class Fizzbuzz {

    String getFirst100FizzBuzz() {
        String first100 = "";
        for (int number = 1; number <= 100; number++) {
            first100 += fizzbuzzOf(number) + "\n";
        }
        return first100;
    }

    String fizzbuzzOf(int number) {
        String fizzbuzz = "";
        if (isMultipleOf3(number)) {
            fizzbuzz += "Fizz";
        }
        if (isMultipleOf5(number)) {
            fizzbuzz += "Buzz";
        }
        if (!isMultipleOf3(number) && !isMultipleOf5(number)) {
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