class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> l=new HashMap<>();
       for(int z=0;z<nums.length;z++)
       {
            if(l.containsKey(nums[z]))
            {
                l.remove(nums[z]);
            }
            else
            {
                l.put(nums[z],1);
            }
       }
       ArrayList<Integer> a=new ArrayList<>(l.keySet());
       return a.get(0);
    }
}