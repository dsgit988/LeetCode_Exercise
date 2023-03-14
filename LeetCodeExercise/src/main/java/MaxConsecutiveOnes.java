import java.util.Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
            }
            if (nums[i] == 0){
                if (count > max) max = count;
                count = 0;
            }
        }
        if (count > max) max = count;
        return max;
    }

}
