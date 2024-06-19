class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int num=0;
        int key=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(i==0)
            {
                num+=key*m.get(s.charAt(i));
                
            }
            else if(m.get(s.charAt(i))>m.get(s.charAt(i-1)))
            {
                int k=key*m.get(s.charAt(i));
                num+=k;
                
                key*=-1;
            }
            else
            {
                num+=key*m.get(s.charAt(i));
                
                if(key==-1)
                {
                    key*=-1;
                }
            }
        }
        return num;

    }
}