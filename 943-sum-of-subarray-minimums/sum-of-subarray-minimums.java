class Solution {
    public int [] findnse(int arr[])
    {
        int nse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();
            if(st.isEmpty())
            nse[i]=arr.length;
            else nse[i]=st.peek();
            st.push(i);
        }
        return nse;
    }

    public int [] findpse (int arr[])
    {
        int nse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();
            if(st.isEmpty())
            nse[i]=-1;
            else nse[i]=st.peek();
            st.push(i);
        }
        return nse;
    }



    public int sumSubarrayMins(int[] arr) {
        int nse[]=findnse(arr);
        int pse[]=findpse(arr);
        int total=0, mod=(int)(1e9+7);
        for(int i=0;i<arr.length;i++)
        {
            int left=i-pse[i];
            int right=nse[i]-i;
            total = (int)((total + (long)left * right * arr[i]) % mod);
        }
        return total;
       

    }
}