public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length != 1) {
            int left = 0, right = nums.length - 1, current = left;
            while (left <= right && current <= right){
                if (nums[current] == 2){
                    nums[current] = nums[right];
                    nums[right] = 2;
                    right--;
                }else if(nums[current] == 0){
                    nums[current] = nums[left];
                    nums[left] = 0;
                    left++;
                    current++;
                }else{
                    current++;
                }



            }
        }

    }
}
