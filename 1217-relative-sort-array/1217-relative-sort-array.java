class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> l=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
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
        for(int k=0;k<arr2.length;k++)
        {
            for(int z=0;z<l.get(arr2[k]);z++)
            {
                ans.add(arr2[k]);
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
        int a[]=new int[arr1.length];
        int c=0;
        int c1=0;
        for(int f=0;f<arr1.length;f++)
        {
            if(f<ans.size())
            {
                a[c]=ans.get(f);
                c++;
            }
            else
            {
                a[c]=rem.get(c1);
                c++;
                c1++;
            }
        }
        return a;
    }
}