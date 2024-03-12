import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckSudokuTest {
    @Test
    public void exampleTest(){
        List<Integer[]> input = new ArrayList<>();
        input.add(new Integer[]{2, 2, 5});
        input.add(new Integer[]{2, 5, 1});
        input.add(new Integer[]{5, 2, 3});
        input.add(new Integer[]{2, 8, 5});

        CheckSudoku checkSudoku = new CheckSudoku();

        assertEquals("WRONG INPUT", checkSudoku.evaluateInsertions(input));
    }

    @Test
    public void nineTest(){
        List<Integer[]> input = new ArrayList<>();
        input.add(new Integer[]{2, 2, 5});
        input.add(new Integer[]{9, 9, 9});

        CheckSudoku checkSudoku = new CheckSudoku();

        assertEquals("OK", checkSudoku.evaluateInsertions(input));
    }
}
