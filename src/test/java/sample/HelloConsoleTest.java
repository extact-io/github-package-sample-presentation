package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloConsoleTest {
    @Test
    void testGetMessage() {
        var expected = "SerivceMessage:Hello";
        var actual = HelloConsole.getMessage();
        assertEquals(expected, actual);
    }
}
