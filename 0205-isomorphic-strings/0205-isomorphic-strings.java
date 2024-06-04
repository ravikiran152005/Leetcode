class Solution {
    public boolean isIsomorphic(String s, String t) {
        String a="";
        String b="";
        HashMap<Character,Integer> ha=new HashMap<>();
        HashMap<Character,Integer> ba=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(ha.containsKey(s.charAt(i)))
            {
                a+=ha.get(s.charAt(i));
                a+=',';
            }
            else
            {
                a+=i;
                a+=',';
                ha.put(s.charAt(i),i);
            }

            if(ba.containsKey(t.charAt(i)))
            {
                b+=ba.get(t.charAt(i));
                b+=',';
            }
            else
            {
                b+=i;
                b+=',';
                ba.put(t.charAt(i),i);
            }
        }
        return a.equals(b);
    }
}