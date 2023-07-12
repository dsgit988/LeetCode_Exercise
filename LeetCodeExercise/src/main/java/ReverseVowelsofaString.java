public class ReverseVowelsofaString {

    boolean notVowel(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int left = 0;
        int right = sArr.length - 1;

        while (left < right){


            while (left < s.length() && notVowel(sArr[left])){
                left++;

            }

            while (right >= 0 && notVowel(sArr[right])) {
                right--;

            }

            if (left < right){
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
            }
            left++;
            right--;


        }
        return new String(sArr);
    }
}
