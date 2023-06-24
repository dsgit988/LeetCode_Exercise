public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {

        //loop to get sum of k elements
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        for (int i = 0; i < k; i++){
            tempSum += nums[i];
        }
        maxSum = tempSum;

        //slide windows to the right, tempSum = sum + right - left
        for (int i = k; i < nums.length; i++){
            tempSum = tempSum + nums[i] - nums[i - k];
            //if maxAve greater than tempSum, then tempSum beccome maxSUm
            if (tempSum > maxSum){
                maxSum = tempSum;
            }
        }



        //Calculate the max Avg and return it
        return (double) maxSum / k ;

    }
}
