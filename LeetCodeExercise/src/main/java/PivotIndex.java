public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length ; i++) {

            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }

        return -1;

    }
}
