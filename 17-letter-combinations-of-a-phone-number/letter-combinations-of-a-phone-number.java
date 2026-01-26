class Solution {
    static String KEYPAD[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0 || digits==null)
        return ans;
        StringBuilder temp=new StringBuilder();
        cal(0,temp,ans,digits);
        return ans;

    }

    public void cal(int i, StringBuilder temp, List<String>ans, String digits)
    {
        if(i==digits.length())
        {
            ans.add(temp.toString());
            return;
        }
        String letters=KEYPAD[digits.charAt(i)-'0'];
        for(int j=0;j<letters.length();j++)
        {
            temp.append(letters.charAt(j));
            cal(i+1,temp,ans,digits);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}