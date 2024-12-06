import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = -1 , sum = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        Set<Integer> keys = mpp.keySet();
        for(int i : keys)
        {
            max = Math.max(max,mpp.get(i));
        }

        for(int i : keys)
        {
            int freq = mpp.get(i);
            if(freq == max)
            {
                sum += freq;
            }
        }
        return sum;
    }
}