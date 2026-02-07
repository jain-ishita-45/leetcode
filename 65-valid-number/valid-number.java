class Solution {
    public boolean isNumber(String s) {
        if(s.length()==0) return false;
        boolean digit=false, eseen=false, dot=false;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            digit=true;
            else if(ch=='+' || ch=='-')
            {
                if(c==2) return false;
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') return false;
                if(i==s.length()-1) return false;
                c++;
            }
            else if(ch=='.')
            {
                if(eseen || dot)
                return false;
                if(i==s.length()-1 && !digit)
                return false;
                dot=true;
            }
            else if(ch=='e' || ch=='E')
            {
                if(eseen || !digit || i==s.length()-1)
                return false;
                eseen=true;
            }
            else
            return false;
        }
        return true;

    }
}