public class MaximumNumberofWordsFoundinSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence: sentences){
            int numOfSpace = sentence.split(" ").length;
            if (numOfSpace > max) max = numOfSpace;
        }

        return max;
    }
}
