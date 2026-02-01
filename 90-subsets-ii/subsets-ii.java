class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        Arrays.sort(nums);
        cal(0,nums,ans,result);
        return ans;
    }

    public void cal(int i,int [] arr,  List<List<Integer>> ans, List<Integer> result)
    {
        if(i==arr.length)
        {
            if(!ans.contains(result))
            {ans.add(new ArrayList<>(result));
            return;
            }
            return;
        }
        result.add(arr[i]);
        cal(i+1,arr,ans,result);
        result.remove(result.size()-1);
        cal(i+1,arr,ans,result);
    }
}