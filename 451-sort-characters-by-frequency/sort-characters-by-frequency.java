class Pair{
    char ch;
    int d;
    Pair(char ch, int d)
    {
        this.ch=ch;
        this.d=d;
    }
}


class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.d-a.d);
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            char ch=e.getKey();
            int digit=e.getValue();
            pq.offer(new Pair(ch,digit));
        }
        StringBuilder str=new StringBuilder();
        while(!pq.isEmpty())
        {
            Pair ch=pq.poll();
            
            for(int i=1;i<=ch.d;i++)
            str.append(ch.ch);
        }
        return str.toString();


    }
}