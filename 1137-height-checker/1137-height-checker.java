class Solution {
    public int heightChecker(int[] heights) {
        int ar[]=new int[heights.length];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=heights[i];

        }
        Arrays.sort(ar);
        int c=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=heights[i])
            {
                c++;
            }
        }
        return c;
    }
}