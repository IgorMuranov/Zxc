package testproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class AggregatorTest {

    @Test
    public void testAddValueAndGetSum() {
        Aggregator aggregator = new Aggregator();

        // Add some values
        aggregator.addValue(5.0);
        aggregator.addValue(10.5);
        aggregator.addValue(3.5);

        // Check if the sum is correct
        assertEquals(5.0 + 10.5 + 3.5, aggregator.getSum(), 0.001);
    }

    @Test
    public void testReset() {
        Aggregator aggregator = new Aggregator();

        // Add some values
        aggregator.addValue(5.0);
        aggregator.addValue(10.5);

        // Reset the aggregator
        aggregator.reset();

        // Check if the sum is reset to zero
        assertEquals(0.0, aggregator.getSum(), 0.001);
    }
}
