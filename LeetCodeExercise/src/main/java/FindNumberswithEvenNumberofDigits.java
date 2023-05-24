public class FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            int numOfDigit = Integer.toString(num).length();
            if (numOfDigit % 2 == 0) count++;
        }

        return count;
    }
}
