import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromaString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '*' && !stack.empty()){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        return stack.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
