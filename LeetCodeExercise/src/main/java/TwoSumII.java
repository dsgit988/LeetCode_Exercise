public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            if (numbers[left] + numbers[right]  > target){
                right--;
            }else if (numbers[left] + numbers[right]  < target){
                left++;
            }else {
                break;
            }
        }

        left++;
        right++;

        return  new int[]{left,right};

    }
}