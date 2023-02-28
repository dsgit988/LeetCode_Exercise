import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TopKFrequentWords r = new TopKFrequentWords();
        String[] s = new String[]{"i","love","leetcode","i","love","coding"};

        r.topKFrequent(s,2);
    }
}
