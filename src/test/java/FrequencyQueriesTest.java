import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyQueriesTest {

    @Test
    public void firstTest() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1,5));
        input.add(Arrays.asList(1,6));
        input.add(Arrays.asList(3,2));
        input.add(Arrays.asList(1,10));
        input.add(Arrays.asList(1,10));
        input.add(Arrays.asList(1,6));
        input.add(Arrays.asList(2,5));
        input.add(Arrays.asList(3,2));

        List<Integer> expected = Arrays.asList(0,1);

        assertEquals(expected, FrequencyQueries.freqQuery(input) );
    }
    @Test
    public void secondTest() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(3,4));
        input.add(Arrays.asList(2,1003));
        input.add(Arrays.asList(1,16));
        input.add(Arrays.asList(3,1));

        List<Integer> expected = Arrays.asList(0,1);

        assertEquals(expected, FrequencyQueries.freqQuery(input) );
    }
    @Test
    public void thirdTest() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1,3));
        input.add(Arrays.asList(2,3));
        input.add(Arrays.asList(3,2));
        input.add(Arrays.asList(1,4));
        input.add(Arrays.asList(1,5));
        input.add(Arrays.asList(1,5));
        input.add(Arrays.asList(1,4));
        input.add(Arrays.asList(3,2));
        input.add(Arrays.asList(2,4));
        input.add(Arrays.asList(3,2));

        List<Integer> expected = Arrays.asList(0,1,1);

        assertEquals(expected, FrequencyQueries.freqQuery(input) );
    }
    @Test
    public void fourthTest() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000005));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(1, 10000045));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000017));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000009));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000050));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(1, 10000040));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(1, 10000009));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(1, 10000046));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000040));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(1, 10000009));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(1, 10000040));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000028));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000046));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000008));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000043));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000023));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000043));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000045));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(1, 10000017));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000032));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000023));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000043));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000050));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000009));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000028));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000005));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000023));
        input.add(Arrays.asList(1, 10000045));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000046));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(1, 10000017));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000032));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000046));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(1, 10000002));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(1, 10000034));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000022));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000028));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000045));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(1, 10000007));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000032));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000032));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(1, 10000017));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(1, 10000022));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(1, 10000036));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(1, 10000047));
        input.add(Arrays.asList(1, 10000039));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(1, 10000005));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000009));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000013));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000003));
        input.add(Arrays.asList(1, 10000037));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(1, 10000001));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000024));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000011));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(1, 10000048));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(1, 10000043));
        input.add(Arrays.asList(1, 10000022));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000019));
        input.add(Arrays.asList(1, 10000046));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(1, 10000006));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 2));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(3, 9));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000014));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(1, 10000018));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 10));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000030));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000049));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(1, 10000004));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000033));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000029));
        input.add(Arrays.asList(1, 10000043));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000015));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000012));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(1, 10000050));
        input.add(Arrays.asList(1, 10000042));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000021));
        input.add(Arrays.asList(1, 10000031));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(2, 1));
        input.add(Arrays.asList(1, 10000040));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000045));
        input.add(Arrays.asList(2, 4));
        input.add(Arrays.asList(1, 10000035));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(1, 10000041));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(1, 10000023));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(3, 7));
        input.add(Arrays.asList(1, 10000017));
        input.add(Arrays.asList(2, 7));
        input.add(Arrays.asList(1, 10000044));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(3, 3));
        input.add(Arrays.asList(1, 10000026));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 6));
        input.add(Arrays.asList(1, 10000025));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(3, 2));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(1, 10000027));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(1, 10000005));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(3, 5));
        input.add(Arrays.asList(1, 10000038));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(2, 8));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(2, 10));
        input.add(Arrays.asList(2, 9));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 3));
        input.add(Arrays.asList(3, 8));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(1, 10000010));
        input.add(Arrays.asList(1, 10000016));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(3, 1));
        input.add(Arrays.asList(1, 10000020));
        input.add(Arrays.asList(2, 5));
        input.add(Arrays.asList(2, 1));
        

        List<Integer> expected = Arrays.asList(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                0,
                1,
                0,
                1,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                0,
                1,
                0,
                0,
                0,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                0,
                0,
                1,
                0,
                0,
                1,
                1,
                0,
                0,
                1,
                1,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                0,
                0,
                0,
                1,
                0,
                0,
                1,
                0,
                0,
                1,
                1,
                0,
                0,
                1,
                0,
                0,
                1,
                0,
                0,
                0,
                1,
                1,
                0,//there
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                0,
                1,
                0,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                0,
                0,
                1,
                0,
                0,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                0,
                1,
                0,
                0,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                0,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1
        );

        assertEquals(expected, FrequencyQueries.freqQuery(input) );
    }
}
