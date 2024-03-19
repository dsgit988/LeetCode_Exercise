public class MoveZeros1 {
    public void moveZeroes(int[] nums) {
        int lastNonNumIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[lastNonNumIndex++] = nums[i];
            }
        }

        for (int j = lastNonNumIndex; j < nums.length; j++ ){
            nums[j] = 0;
        }
    }
}
