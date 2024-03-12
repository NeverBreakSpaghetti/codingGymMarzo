import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastMaximumTest {
    @Test
    public void generateSequence(){
        int[] input = new int[]{10, 8, 1};
        FastMaximum fastMaximum = new FastMaximum();

        int[] sequence = fastMaximum.generateSequence(input);

        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,1,0},sequence);
    }

    @Test
    public void firstAcceptanceTest(){
        Sequence sequence = new Sequence(10, 8, 1);
        FastMaximum fastMaximum = new FastMaximum();

        assertEquals(7, fastMaximum.findPeak(sequence));
    }

    @Test
    public void secondAcceptanceTest(){
        Sequence sequence = new Sequence(100000, 60500, 50);
        FastMaximum fastMaximum = new FastMaximum();

        assertEquals(3024950, fastMaximum.findPeak(sequence));
    }

    @Test
    public void thirdAcceptanceTest(){
        Sequence sequence = new Sequence(100000000, 70000000, 20);
        FastMaximum fastMaximum = new FastMaximum();


        assertEquals(1399999980, fastMaximum.findPeak(sequence));
    }
    @Test
    public void oneElementTest(){
        Sequence sequence = new Sequence(1, 0, 1);
        FastMaximum fastMaximum = new FastMaximum();


        assertEquals(0, fastMaximum.findPeak(sequence));
    }
}
