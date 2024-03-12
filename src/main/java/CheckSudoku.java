import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSudoku {
    public static void main(String[] args) throws IOException {
        List<Integer[]> input = parseInput(); //entry : [row, column, value]
        CheckSudoku checkSudoku = new CheckSudoku();

        System.out.println(checkSudoku.evaluateInsertions(input));
    }

    private static List<Integer[]> parseInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int insertionsNumber = Integer.parseInt(br.readLine());
        List<Integer[]> insertions = new ArrayList<>(insertionsNumber);
        for (int i = 0; i < insertionsNumber; i++) {
            String insertionString = br.readLine();
            Integer[] insertion = Arrays.stream(insertionString.split(" "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
            insertions.add(insertion);
        }
        return insertions;
    }

    public String evaluateInsertions(List<Integer[]> insertions) {
        boolean [][] rows = new boolean[9][9];
        boolean [][] columns = new boolean[9][9];
        boolean [][][] groups = new boolean[3][3][9];
        for (Integer[] insertion : insertions) {
            int row = insertion[0]-1;
            int column = insertion[1]-1;
            int value = insertion[2]-1;

            if (isAlreadyPresent(value, row, rows))
                return "WRONG INPUT";
            if (isAlreadyPresent(value,column,columns))
                return "WRONG INPUT";
            if (isAlreadyPresent(value,row/3,column/3,groups))
                return "WRONG INPUT";

            rows[row][value] = true;
            columns[column][value] = true;
            groups[row/3][column/3][value] = true;
        }
        return "OK";
    }

    private boolean isAlreadyPresent(int value, int position, boolean[][] matrix){
        return matrix[position][value];
    }
    private boolean isAlreadyPresent(int value, int x, int y, boolean[][][] matrix){
        return matrix[x][y][value];
    }
}
