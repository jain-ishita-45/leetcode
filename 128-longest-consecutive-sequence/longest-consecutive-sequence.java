class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        pq.offer(nums[i]);
        if(nums.length==0) return 0;
        int prev=pq.poll();
        System.out.println(pq);
        int c=1,max=1;
        while(!pq.isEmpty())
        {
            int cur=pq.poll();
            System.out.println(cur);
            if(cur==prev+1)
            c++;
            else if(prev==cur) continue;
            else
            {
                max=Math.max(max,c);
                c=1;
            }
            prev=cur;

        }
          max=Math.max(max,c);
        System.out.println(pq);
        return max;
    }
}