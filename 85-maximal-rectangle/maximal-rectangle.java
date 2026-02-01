class Solution {

    public int largest(int []ht)
    {
        Stack<Integer> st=new Stack<>();
        int maxa=0;
        int n=ht.length;
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty() && (i==n|| ht[st.peek()]>=ht[i]))
            {
                int h=ht[st.peek()];
                st.pop();
                int w;
                if(st.isEmpty())
                w=i;
                else
                w=i-st.peek()-1;
                maxa=Math.max(maxa,h*w);
            }
            st.push(i);
        }
        return maxa;
    }
    public int maximalRectangle(char[][] matrix) {
        int maxarea=0;
        int ht[]=new int[matrix[0].length];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]=='1')
                ht[j]++;
                else
                ht[j]=0;
            }
            int area=largest(ht);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}