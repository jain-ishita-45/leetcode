class Solution {
    public int minimumCost(int[] nums) {
        int sum=0;
        if(nums.length==3)
        {
            return nums[0]+nums[1]+nums[2];
        }
        sum=nums[0];
        int k=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<nums.length;i++)
        {
            if(k==2 && pq.peek()>nums[i])
            {
                pq.poll();
                pq.offer(nums[i]);
            }
            else if(k!=2)
            {
            pq.offer(nums[i]);
            k++;

            }
        }
        while(!pq.isEmpty())
        sum+=pq.poll();
        return sum;
    }
}