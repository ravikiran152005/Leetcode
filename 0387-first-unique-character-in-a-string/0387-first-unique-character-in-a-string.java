class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for(int j=0;j<s.length();j++)
        {
            if(m.get(s.charAt(j))==1)
            {
                return j;
            }
        }
        return -1;
    }
}