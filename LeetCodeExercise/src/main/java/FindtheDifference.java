import java.util.Arrays;

public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        char diff = 0;

        for (int i = 0; i < sArr.length; i++){
            if (tArr[i] != sArr[i]){
                diff = tArr[i];
                break;
            }
        }

        if (diff == 0){
            diff = tArr[tArr.length - 1];
        }

        return diff;
    }
}
