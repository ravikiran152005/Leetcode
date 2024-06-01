class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length();i++)
        {
            if(i!=s.length()-1)
            {
                int a=(int)s.charAt(i)-(int)s.charAt(i+1);
                if(a<0)
                {
                    a*=-1;
                    score+=a;
                }
                else
                {
                    score+=a;
                }
            }
        }
        return score;
    }
}