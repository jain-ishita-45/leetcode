class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<fruits.length)
        {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()<=2)
            {
                maxlen=Math.max(maxlen,r-l+1);
               
            }
            else
            {
                if(map.containsKey(fruits[l]))
               map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
               if(map.get(fruits[l])==0)
               map.remove(fruits[l]);
               l++;
            }
             r++;
        }
        return maxlen;
    }
}