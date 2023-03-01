import java.util.*;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key,value);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){

            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }
      return -1;
    }


}
