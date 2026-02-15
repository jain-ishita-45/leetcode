class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
         List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<bulbs.size();i++)
        map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int e1=e.getValue();
            if(e1%2==0)
            continue;
            ans.add(e.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}