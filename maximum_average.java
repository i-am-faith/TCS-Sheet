class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }
        int maxi = sum;
        int si = 0;
        int ei = k;
        while(ei < nums.length)
        {
            sum -= nums[si];
            si++;

            sum += nums[ei];
            ei++;

            maxi = Math.max(maxi,sum);
        }

        return (double) maxi/k;
    }
}