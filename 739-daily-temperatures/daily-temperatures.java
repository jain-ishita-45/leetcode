class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int []> s=new Stack<>();
        int []ans=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()[0]<=temperatures[i])
            s.pop();
            if(s.isEmpty()) ans[i]=0;
            else
            ans[i]=s.peek()[1]-i;
            s.push(new int[]{temperatures[i],i});

        }
        return ans;
    }
}