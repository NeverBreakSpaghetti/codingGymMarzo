import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastMaximum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[3];
        input[0] = Integer.parseInt(br.readLine());
        input[1] = Integer.parseInt(br.readLine());
        input[2] = Integer.parseInt(br.readLine());

        FastMaximum fastMaximum = new FastMaximum();
        int[] sequence = fastMaximum.generateSequence(input);

        System.out.println(fastMaximum.findPeak(sequence));
    }
    public int findPeak(int[] sequence) {
        int start = 0;
        int end = sequence.length-1;
        int center = getCenterPosition(start, end);;
        int max=-1;

        do {
            int centerValue = getCenterValue(start, end, sequence);

            if (centerValue>max) {
                max = centerValue;
                start = center;
            } else
                end = center;
            center = getCenterPosition(start, end);
        }while (center!=start && center!=end);

        return max;
    }

    private static int getCenterPosition(int start, int end) {
        return start + (end - start)/2;
    }

    private int getCenterValue(int start, int end, int[] array){
        int centerPosition = getCenterPosition(start, end);
        return array[centerPosition];
    }

    public int[] generateSequence(int[] input) {
        int size = input[0];
        int increaseToPosition = input[1];
        int increaseStep = input[2];

        int[] result = new int[size];

        int valueToAppend = -1;
        for (int i = 0; i < size; i++) {
            if (i<increaseToPosition)
                valueToAppend=increaseStep*i;
           else
               valueToAppend= size -1 -(increaseStep*i);

            result[i]=valueToAppend;
        }

        return result;
    }
}
