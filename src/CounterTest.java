package Inlamning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {
    @Test
    public void CounterTestOne() {

        Counter counter = new Counter();
        counter.countLinesAndChars("Test line");

        int expectedLines = 1;
        int actualLines = counter.lines;

        assertEquals(expectedLines, actualLines);
    }
    @Test
    public void CounterTestTwo() {

        Counter counter = new Counter();
        counter.countLinesAndChars("Test line1");
        counter.countLinesAndChars("Test line2");
        counter.countLinesAndChars("Test line3");

        int expectedLines = 3;
        int actualLines = counter.lines;

        assertEquals(expectedLines, actualLines);
    }
    @Test
    public void CounterTestThree() {

        Counter counter = new Counter();
        counter.countLinesAndChars("Test chars");

        int expectedChars = 10;
        int actualChars = counter.chars;

        assertEquals(expectedChars, actualChars);
    }

}
