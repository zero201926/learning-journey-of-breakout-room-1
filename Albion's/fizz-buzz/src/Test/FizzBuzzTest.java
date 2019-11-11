package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        Main.FizzBuzz instance = new Main.FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println(instance.result(i));
                assertEquals("FizzBuzz", instance.result(i));
            } else if (i % 3 == 0) {
                System.out.println(instance.result(i));
                assertEquals("Fizz", instance.result(i));
            } else if (i % 5 == 0) {
                System.out.println(instance.result(i));
                assertEquals("Buzz", instance.result(i));
            } else {
                System.out.println(instance.result(i));
                assertEquals("" + i, instance.result(i));
            }
        }
    }
}
