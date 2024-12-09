import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arrl = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                arrl.add(nums[i]);
            }
        }

        return arrl;
    }
}