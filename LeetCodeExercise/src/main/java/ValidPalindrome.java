import java.util.ArrayList;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        int left = 0, right = list.size() - 1;
        while (left <= right){
            if (list.get(left) != list.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
