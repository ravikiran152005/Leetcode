class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean ans=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]%2==0)
            {
                if(nums[i+1]%2!=0)
                {
                    continue;
                }
                else
                {
                    ans=false;
                    break;
                }
            }
            else if(nums[i]%2!=0)
            {
                if(nums[i+1]%2==0)
                {
                    continue;
                }
                else
                {
                    ans=false;
                    break;
                }
            }

        }
        return ans;
    }
}