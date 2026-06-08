class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)) )
            ans.append(s.charAt(i));
           
        }
        String a=ans.toString().toLowerCase();
        System.out.println(a);
        StringBuilder rev=new StringBuilder(ans.reverse());
        String r=ans.toString().toLowerCase();
        System.out.println(r);
        return a.equals(r);
    }
}