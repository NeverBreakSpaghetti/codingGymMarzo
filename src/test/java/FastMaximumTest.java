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
        int[] input = new int[]{10, 8, 1};
        FastMaximum fastMaximum = new FastMaximum();
        int[] sequence = fastMaximum.generateSequence(input);

        int maxElement =  fastMaximum.findPeak(sequence);

        assertEquals(7, maxElement);
    }

    @Test
    public void secondAcceptanceTest(){
        int[] input = new int[]{100000, 60500, 50};
        FastMaximum fastMaximum = new FastMaximum();
        int[] sequence = fastMaximum.generateSequence(input);

        int maxElement =  fastMaximum.findPeak(sequence);

        assertEquals(3024950, maxElement);
    }

    @Test
    public void thirdAcceptanceTest(){
        int[] input = new int[]{100000000, 70000000, 20};
        FastMaximum fastMaximum = new FastMaximum();
        int[] sequence = fastMaximum.generateSequence(input);

        int maxElement =  fastMaximum.findPeak(sequence);

        assertEquals(1399999980, maxElement);
    }
    @Test
    public void pippo(){
        int[] input = new int[]{1, 0, 1};
        FastMaximum fastMaximum = new FastMaximum();
        int[] sequence = fastMaximum.generateSequence(input);

        int maxElement =  fastMaximum.findPeak(sequence);

        assertEquals(0, maxElement);
    }
}
