import java.util.*;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while (left < right){
            if ((nums[left] + nums[right]) > target){
                right--;
            }else if ((nums[left] + nums[right]) < target) {
                left++;
            }else{
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (Objects.equals(entry.getValue(), nums[left])) {
                        result.add(entry.getKey());
                        continue;
                    }
                    if (Objects.equals(entry.getValue(), nums[right])) {
                        result.add(entry.getKey());
                    }
                }

                break;
            }
        }


        return new int[]{result.get(0), result.get(1)};
    }
}
