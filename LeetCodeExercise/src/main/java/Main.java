import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String s = "Let's take LeetCode contest";
//        ReverseWordsinaStringIII r = new ReverseWordsinaStringIII();
//        System.out.println(r.reverseWords(s));

        MergeIntervals m = new MergeIntervals();
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        m.merge(intervals);
    }
}
