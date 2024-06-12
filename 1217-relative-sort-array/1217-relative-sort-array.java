class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> l=new HashMap<>();
        int ans[]=new int[arr1.length];
        for(int i=0;i<arr2.length;i++)
        {
            l.put(arr2[i],0);
        }
        for(int j=0;j<arr1.length;j++)
        {
            if(l.containsKey(arr1[j]))
            {
                l.put(arr1[j],l.get(arr1[j])+1);
            }
            else
            {
                l.put(arr1[j],1);
            }
        }
        int c=0;
        for(int k=0;k<arr2.length;k++)
        {
            for(int z=0;z<l.get(arr2[k]);z++)
            {
                ans[c]=arr2[k];
                c++;
            }
            l.remove(arr2[k]);

        }
        ArrayList<Integer> rem=new ArrayList<>();
        for(int m=0;m<arr1.length;m++)
        {
            if(l.containsKey(arr1[m]))
            {
                rem.add(arr1[m]);
            }
        }
        
        Collections.sort(rem);
        
        for(int x=0;x<rem.size();x++)
        {
            ans[c]=rem.get(x);
            c++;
        }

        return ans;
    }
}