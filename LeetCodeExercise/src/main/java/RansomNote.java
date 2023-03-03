public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (int i = 0; i < magazine.length(); i++){
            table[magazine.charAt(i) - 'a'] += 1;
        }
        for (int j = 0; j < ransomNote.length(); j++){
            table[ransomNote.charAt(j) - 'a'] -= 1;
            if (table[ransomNote.charAt(j) - 'a'] < 0) return false;
        }

        return true;
    }
}
