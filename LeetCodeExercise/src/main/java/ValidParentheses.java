import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ')' && s.charAt(i) != ']' && s.charAt(i) != '}') {
                stack.add(s.charAt(i));

            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }

            } else if (s.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            } else if (s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }

        }

        return stack.isEmpty();
    }
}
