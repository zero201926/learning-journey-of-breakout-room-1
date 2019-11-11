package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void printHelloWorld(){
        //arrange
        String str= "hello";
        Main testMain = new Main();
        //act
        String stuff = testMain.hello();
        //assert
        assertEquals(str, stuff);


    }

}