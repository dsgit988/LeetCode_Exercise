public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int end = Math.min(word1.length(), word2.length());

        for (int i = 0; i < end; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        result.append(word1.substring(end));
        result.append(word2.substring(end));

        return result.toString();

    }
}
