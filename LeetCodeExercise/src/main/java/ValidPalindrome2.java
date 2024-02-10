public class ValidPalindrome2 {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        String lowerS = s.toLowerCase();

        char startChar, endChar;
        boolean validStart, validEnd;

        while(start <= end){
            startChar = lowerS.charAt(start);
            endChar = lowerS.charAt(end);
            validStart = Character.isLetterOrDigit(startChar);
            validEnd = Character.isLetterOrDigit(endChar);

            if (validStart &&  validEnd){
                if(startChar != endChar){
                    return  false;
                }
                start++;
                end--;
            }
            if (!validStart){
                start++;
            }
            if (!validEnd){
                end--;
            }

        }
        return true;


    }
}
