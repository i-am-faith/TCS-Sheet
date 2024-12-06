class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer> arrl1 = new ArrayList<>();
        ArrayList<Integer> arrl2 = new ArrayList<>();
        ArrayList<Integer> fin = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0;i<n/2;i++)
        {
            arrl1.add(arr[i]);
        }
        for(int i=n/2;i<n;i++)
        {
            arrl2.add(arr[i]);
        }
        
        Collections.sort(arrl1);
        Collections.sort(arrl2,Collections.reverseOrder());
        
        for(int i=0;i<arrl1.size();i++)
        {
            fin.add(arrl1.get(i));
        }
        for(int i=0;i<arrl2.size();i++)
        {
            fin.add(arrl2.get(i));
        }
        
        return fin;
    }
}