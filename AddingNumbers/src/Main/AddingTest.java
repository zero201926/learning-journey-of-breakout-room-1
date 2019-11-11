package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingTest {
    @Test
    public void addUpNumbers(){
        //Arrange
        Adding add = new Adding();

        //Act
        int theMethod = add.calculating();

        //Assert
        assertEquals(5, theMethod);
    }
}