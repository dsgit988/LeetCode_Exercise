import java.util.Stack;

public class RemoveStar {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != '*'){
                stack.add(c);
            }else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character cr: stack){
            sb.append(cr);
        }

        return sb.toString();
    }
}
