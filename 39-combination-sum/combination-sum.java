class Solution {
    public void sum(int []candidates, int target, int i, int s, List<Integer>list, List<List<Integer>> result )
    {
        if(s>target) return;
        if(s==target)
        {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(i==candidates.length) return;
        list.add(candidates[i]);
        sum(candidates,target,i,s+candidates[i],list,result);
        
        list.remove(list.size()-1);
        sum(candidates,target,i+1,s,list,result);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        sum(candidates,target,0,0,new ArrayList<>(),result);
        return result;
    }
}