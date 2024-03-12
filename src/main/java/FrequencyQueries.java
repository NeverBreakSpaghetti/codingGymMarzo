import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {
//    public static List<Integer> freqQuery(List<List<Integer>> queries) {
//        Map<Integer, Integer> numberFrequency = new HashMap<>();
//        Map<Integer, Integer> frequencyOccurrences = new HashMap<>();
//        List<Integer> queryResults = new ArrayList<>();
//
//        for (List<Integer> query : queries) {
//            int queryType = query.get(0);
//            int number = query.get(1);
//
//            switch (queryType) {
//                case 1 -> FrequencyQueries.insert(number, numberFrequency, frequencyOccurrences);
//                case 2 -> FrequencyQueries.remove(number, numberFrequency, frequencyOccurrences);
//                case 3 -> queryResults.add(FrequencyQueries.printFrequencyOccurrence(number, frequencyOccurrences));
//            }
//        }
//        return queryResults;
//    }
    public static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        Map<Integer, Integer> frequencyOccurrences = new HashMap<>();
        List<Integer> queryResults = new ArrayList<>();

        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int number = query.get(1);

            switch (queryType) {
                case 1:
                    FrequencyQueries.insert(number, numberFrequency, frequencyOccurrences);
                    break;
                case 2 :
                    FrequencyQueries.remove(number, numberFrequency, frequencyOccurrences);
                    break;
                case 3 :
                    queryResults.add(FrequencyQueries.printFrequencyOccurrence(number, frequencyOccurrences));
                    break;
            }
        }
        return queryResults;
    }

    private static int printFrequencyOccurrence(int number, Map<Integer, Integer> frequencyOccurrences) {
        Integer frequencyOccurrence = frequencyOccurrences.get(number);

        if (frequencyOccurrence == null || frequencyOccurrence == 0)
            return 0;
        return 1;
    }

    private static void remove(int number, Map<Integer, Integer> numberFrequency, Map<Integer, Integer> frequencyOccurrences) {
        Integer previousFrequency = numberFrequency.get(number);

        if (previousFrequency == null || previousFrequency == 0) {
            return;
        }

        numberFrequency.put(number, previousFrequency - 1);

        decreaseFrequencyOccurrences(previousFrequency, frequencyOccurrences);
        increaseFrequencyOccurrences(previousFrequency - 1, frequencyOccurrences);
    }

    private static void insert(int number, Map<Integer, Integer> numberFrequency, Map<Integer, Integer> frequencyOccurrences) {
        Integer previousFrequency = numberFrequency.get(number);

        if (previousFrequency == null) {
            numberFrequency.put(number, 1);

            increaseFrequencyOccurrences(1, frequencyOccurrences);
        } else {
            numberFrequency.put(number, previousFrequency + 1);

            decreaseFrequencyOccurrences(previousFrequency, frequencyOccurrences);
            increaseFrequencyOccurrences(previousFrequency + 1, frequencyOccurrences);
        }
    }

    private static void increaseFrequencyOccurrences(Integer frequency, Map<Integer, Integer> frequencyOccurrences) {
        Integer frequencyOccurrence = frequencyOccurrences.get(frequency);
        if (frequencyOccurrence == null)
            frequencyOccurrences.put(frequency, 1);
        else
            frequencyOccurrences.put(frequency, frequencyOccurrence + 1);
    }

    private static void decreaseFrequencyOccurrences(Integer frequency, Map<Integer, Integer> frequencyOccurrences) {
        Integer frequencyOccurrence = frequencyOccurrences.get(frequency);
        if (frequencyOccurrence != null && frequencyOccurrence != 0)
            frequencyOccurrences.put(frequency, frequencyOccurrence - 1);
    }
}
