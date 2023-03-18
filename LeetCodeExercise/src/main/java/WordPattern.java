import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(arr[i])) {
                map.put(pattern.charAt(i), arr[i]);
            }

            if ((map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(arr[i]))) {
                return false;
            }

            if (!map.containsKey(pattern.charAt(i)) && map.containsValue(arr[i])) {
                return false;
            }



        }
        return true;
    }
}
