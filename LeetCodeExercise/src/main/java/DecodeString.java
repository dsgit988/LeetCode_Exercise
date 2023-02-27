import java.util.ArrayList;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        if (s.length() == 1){
            if (Character.isDigit(s.charAt(0))){
                return "";
            }else {
                return s;
            }
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ']'){
                ArrayList<Character> list = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '['){
                    list.add(stack.pop());
                }
                stack.pop();

                int k = 0;
                int base = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }

                while (k != 0){
                    for (int j = list.size() - 1; j >= 0; j--){
                        stack.push(list.get(j));
                    }
                    k--;
                }


            } else {
                stack.push(s.charAt(i));
            }
        }

        String result = "";
        while (!stack.isEmpty()){
            result = stack.pop() + result;
        }

        return result;
    }
}
