import java.util.*;

public class FindDiff2Arrs {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int num: nums1){
            set1.add(num);
        }

        for (int num: nums2){
            set2.add(num);
        }

        for (Integer set: set1){
            if (!set2.contains(set)){
                arr1.add(set);
            }
        }


        for (Integer set: set2){
            if (!set1.contains(set)){
                arr2.add(set);
            }
        }


        List<List<Integer>> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);


        return list;
    }
}
