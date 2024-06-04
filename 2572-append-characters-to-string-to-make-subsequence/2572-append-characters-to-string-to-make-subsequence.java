class Solution {
    public int appendCharacters(String s, String t) {
        int len=t.length();
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(k>=t.length())
            {
                break;
            }

            if(s.charAt(i)==t.charAt(k))
            {  
                len--;
                k++;
            }
           
            
        }
        return len;
    }
}