public class ShortestDistancetoaCharacter {
    public int[] shortestToChar(String s, char c) {
        int a = s.indexOf(c);
        int b = s.indexOf(c,a + 1);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            if (b == -1 || i <= a){
                arr[i] = Math.abs(i - a);
            } else if (i > a && i <= b) {
                arr[i] = Math.min(Math.abs(i - a), Math.abs(i - b));
                if (i == b){
                    a = b;
                    b = s.indexOf(c,a + 1);
                }
            }
        }
        return arr;
    }
}
