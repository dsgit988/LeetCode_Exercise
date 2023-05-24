public class FindNumberswithEvenNumberofDigits1 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            int numOfDigit = 0;
            while (num / 10 > 0){
                numOfDigit++;
                num = num / 10;
            }
            if (numOfDigit % 2 == 0) count++;
        }

        return count;
    }
}

