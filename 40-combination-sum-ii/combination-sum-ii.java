class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<Integer> ans=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        check(0,ans,result,candidates,target,0);
        return result;
    }

    public void check(int i, List<Integer> ans, List<List<Integer>> result, int[] candidates,int target,int sum)
        {
            if(sum>target)
            return;
            if(sum==target)
            {
                result.add(new ArrayList<>(ans));
                return;
            }
            if(i==candidates.length)
            return;
            ans.add(candidates[i]);
            check(i+1,ans,result,candidates,target,sum+candidates[i]);
            ans.remove(ans.size()-1);
               int next = i + 1;
        while (next < candidates.length && candidates[next] == candidates[i]) {
            next++;
        }
        check(next, ans, result, candidates, target, sum);
        }
}