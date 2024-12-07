class Solution {
    public int findMedian(List<Integer> arr) {
        int n = arr.size();
        Collections.sort(arr);
        if(n%2 == 0)
        {
            int mid1 = arr.get(n/2-1);
            int mid2 = arr.get(n/2);
            
            int avg = (mid1 + mid2)/2;
            return avg;
        }
        else
        {
            return arr.get(n/2);
        }
    }
}