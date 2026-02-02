class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        long ans = nums[0];

        // multiset behavior
        TreeMap<Integer, Integer> left = new TreeMap<>();  // k-1 smallest
        TreeMap<Integer, Integer> right = new TreeMap<>(); // rest

        long sum = 0;
        int leftSize = 0;

        // helper functions
        java.util.function.BiConsumer<TreeMap<Integer,Integer>, Integer> add =
            (map, x) -> map.put(x, map.getOrDefault(x, 0) + 1);

        java.util.function.BiConsumer<TreeMap<Integer,Integer>, Integer> remove =
            (map, x) -> {
                if (map.get(x) == 1) map.remove(x);
                else map.put(x, map.get(x) - 1);
            };

        // initial window
        for (int i = 1; i <= dist + 1; i++) {
            add.accept(left, nums[i]);
            sum += nums[i];
            leftSize++;
        }

        // keep only k-1 smallest
        while (leftSize > k - 1) {
            int x = left.lastKey(); // largest
            remove.accept(left, x);
            add.accept(right, x);
            sum -= x;
            leftSize--;
        }

        long minSum = sum;

        // sliding window
        for (int i = dist + 2; i < nums.length; i++) {
            int addVal = nums[i];

            // add
            if (leftSize > 0 && addVal < left.lastKey()) {
                add.accept(left, addVal);
                sum += addVal;
                leftSize++;

                int move = left.lastKey();
                remove.accept(left, move);
                add.accept(right, move);
                sum -= move;
                leftSize--;
            } else {
                add.accept(right, addVal);
            }

            // remove
            int rem = nums[i - (dist + 1)];
            if (left.containsKey(rem)) {
                remove.accept(left, rem);
                sum -= rem;
                leftSize--;

                int move = right.firstKey();
                remove.accept(right, move);
                add.accept(left, move);
                sum += move;
                leftSize++;
            } else {
                remove.accept(right, rem);
            }

            minSum = Math.min(minSum, sum);
        }

        return ans + minSum;
    }
}
