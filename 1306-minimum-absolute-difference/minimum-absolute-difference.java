class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=arr[i+1]-arr[i];
            if(min>diff)
            min=diff;
        }
        List<List<Integer>> result=new ArrayList<>();
         for(int i=0;i<arr.length-1;i++)
        {
            int diff=arr[i+1]-arr[i];
            if(min==diff)
            {
                List<Integer> ans=new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                result.add(new ArrayList<>(ans));
            }
        }
        return result;

    }
}