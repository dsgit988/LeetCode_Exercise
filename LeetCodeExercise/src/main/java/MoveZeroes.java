public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int q = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                k = i;
                q = i + 1;
                break;
            }

        }
        if (!(k == 0 && q == 0)) {
            while (q < nums.length) {
                if (nums[q] != 0) {
                    nums[k] = nums[q];
                    nums[q] = 0;
                    k++;
                }
                q++;
            }
        }




    }
}
