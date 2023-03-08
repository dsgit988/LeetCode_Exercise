import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++){
            words[i] = reverse(words[i] );
        }

        return Arrays.stream(words).collect(Collectors.joining(" "));
    }
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
