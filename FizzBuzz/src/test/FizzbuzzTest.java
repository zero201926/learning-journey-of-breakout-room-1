package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    @Test
    public void returnfizzbuzzornumber() {
        main.Fizzbuzz instance = new main.Fizzbuzz();
        assertEquals("fizz", instance.result(3));
        assertEquals("buzz", instance.result(5));
        assertEquals("fizzbuzz", instance.result(15));
        assertEquals("2", instance.result(2));
    }
}