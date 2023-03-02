import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char sKey = s.charAt(i);
            int sValue = sMap.getOrDefault(sKey,0) + 1;
            char tKey = t.charAt(i);
            int tValue = tMap.getOrDefault(tKey,0) + 1;
            sMap.put(sKey,sValue);
            tMap.put(tKey,tValue);
        }
        return sMap.equals(tMap);
    }
}

