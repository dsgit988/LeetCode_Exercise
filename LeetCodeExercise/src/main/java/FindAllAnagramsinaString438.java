import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =new ArrayList<>();

        int length = p.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);


        for (int i = 0; i < s.length() - length + 1; i++){
            char[] subArr = s.substring(i,i + length).toCharArray();

            Arrays.sort(subArr);

            if (Arrays.equals(pArr,subArr)){
                result.add(i);
            }
        }
        System.out.println(result);
        return result;
    }
}
