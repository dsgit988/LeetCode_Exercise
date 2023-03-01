import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(n);
        int sumOfSquare = sumSquare(n);
        while (sumOfSquare != 1){
            sumOfSquare = sumSquare(sumOfSquare);
            if (hashSet.contains(sumOfSquare)) return false;
            hashSet.add(sumOfSquare);
        }
        return true;


    }

    private int sumSquare (int number){
        int sum = 0;
        while (number > 0){
            int remainer = number % 10;
            sum += remainer * remainer;
            number = number / 10;
        }

        return sum;
    }


}
