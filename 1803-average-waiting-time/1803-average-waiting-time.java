class Solution {
    public double averageWaitingTime(int[][] customers) {
        int sum=0;
        double ans=0;
        int cur=customers[0][0]+customers[0][1];
        for(int i=0;i<customers.length;i++)
        {
            if(i!=0)
            {
                if(cur>=customers[i][0])
                {
                    cur+=customers[i][1];
                }
                else
                {
                    cur=customers[i][0]+customers[i][1];
                    ans+=(double)customers[i][1]/customers.length;
                    continue;
                }
            }
            ans+=(double)(cur-customers[i][0])/customers.length;
        }
        return ans;
    }
}