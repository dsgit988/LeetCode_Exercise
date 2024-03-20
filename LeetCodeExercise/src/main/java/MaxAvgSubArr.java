public class MaxAvgSubArr {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;

        for (int i = 0; i < nums.length - k; i++){
            sum = sum + nums[k + i] - nums[i];
            if (sum > max){
                max = sum;
            }
        }

        return max / k;
    }
}
