class Pair
    {
        String string;
        int i;
        Pair(String string, int i)
        {
            this.string=string;
            this.i=i;
        }
    }
class Solution {

    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        for(String s:wordList)
        set.add(s);
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);
        for(String s:set)
        System.out.println(s);
        while(!q.isEmpty())
        {Pair cur=q.poll();
        String ans=cur.string;
        int d=cur.i;
        if(ans.equals(endWord)==true) return d;
        for(int j=0;j<ans.length();j++)
        {
           
            for(char ch='a';ch<='z';ch++)
            {
                char replace[]=ans.toCharArray();
                replace[j]=ch;
                String r=new String(replace);
                if(set.contains(r)==true)
                {
                    set.remove(r);
                    q.offer(new Pair(r,d+1));
                }
            }
        }
        }
        return 0;
        
    }
}