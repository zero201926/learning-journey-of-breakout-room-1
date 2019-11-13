package test;

import main.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void print_hello_world(){
        String hello = "Hello, World!";
        main.HelloWorld output = new main.HelloWorld();
        assertEquals(hello, output.print_hello_world());
    }


}