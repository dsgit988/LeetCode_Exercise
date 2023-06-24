public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[nums.length - 1] = nums[nums.length - 1];

        // prefix sum from left and stored to an array
        for (int i = 1; i < nums.length; i++){
            arr1[i] = arr1[i - 1] + nums[i];
        }

        //prefix sum from right and stored to an array
        for (int j = nums.length - 2; j >= 0; j--){
            arr2[j] = arr2[j + 1] + nums[j];
        }

        if (nums.length == 1 || arr2[1] == 0 || arr1[nums.length - 2] == 0){
            return 0;
        }



        //loop on these 2 array and find if left of first array equal to the right of the second array
        for (int k = 1; k < nums.length - 1; k++){
            if (arr1[k -1 ] == arr2 [k + 1]){
                return k;
            }
        }
        return  -1;
    }
}
