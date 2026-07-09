class Solution {
    class Pair{
        String word;
        int i;

        public Pair(String word, int i)
        {
            this.word=word;
            this.i=i;
        }

    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b) -> {
                if (a.i == b.i)
                    return a.word.compareTo(b.word);
                return b.i - a.i;
            });
        for(Map.Entry<String,Integer> m:map.entrySet())
        {
            pq.offer(new Pair(m.getKey(),m.getValue()));
        }
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=k;i++)
        {
            Pair p=pq.poll();
            ans.add(p.word);
        }
        return ans;
    }
}