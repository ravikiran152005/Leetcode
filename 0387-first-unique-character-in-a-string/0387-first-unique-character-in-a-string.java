class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else
            {
                m.put(s.charAt(i),1);
            }
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