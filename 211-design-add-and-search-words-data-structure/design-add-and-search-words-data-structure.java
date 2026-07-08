class Trie
{
    Trie[] links=new Trie[26];
    boolean flag=false;

    public boolean isEnd()
    {
        return flag;
    }

    public void setEnd()
    {
        flag=true;
    }

    public void put(char ch)
    {
        links[ch-'a']=new Trie();
    }

    public Trie get(char ch)
    {
        return links[ch-'a'];
    }

    public boolean contains(char ch)
    {
        return links[ch-'a']!=null;
    }
}

class WordDictionary {
    Trie root;

    public WordDictionary() {
        root=new Trie();
    }
    
    public void addWord(String word) {
        Trie x=root;
        for(int i=0;i<word.length();i++)
        {
            if(!x.contains(word.charAt(i)))
            x.put(word.charAt(i));
            x=x.get(word.charAt(i));

        }
        x.setEnd();
        
    }
    
    public boolean search(String word) {
        return dfs(word,0,root);
        
    }

    public boolean dfs(String word, int i, Trie node)
    {
        if(node==null) return false;
        if(i==word.length()) return node.isEnd();
        char ch=word.charAt(i);
        if(ch=='.')
        {
            for(int j=0;j<26;j++)
            {
                if(node.links[j]!=null && dfs(word,i+1,node.links[j]))
                return true;
            }
            return false;
        }
        if(!node.contains(ch))
        return false;
        return dfs(word,i+1,node.get(ch));

    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */