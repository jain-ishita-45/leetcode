class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> mh = new PriorityQueue<>();

        for(int integer: arr){
            if(k > 0){
                mh.offer(integer);
                k--;
            }
            else if(Math.abs(mh.peek()-x) > Math.abs(integer - x)){
                mh.poll();
                mh.offer(integer);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!mh.isEmpty()){
            ans.add(mh.poll());
        }        
        return ans;
    }
}