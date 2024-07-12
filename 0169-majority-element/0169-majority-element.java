class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
            {
                m.put(nums[i],m.get(nums[i])+1);
            }
            else
            {
                m.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            int n=nums.length;
            if(m.get(nums[i])>n/2)
            {
                return nums[i];
            }
        }
        return -1;
    }
}