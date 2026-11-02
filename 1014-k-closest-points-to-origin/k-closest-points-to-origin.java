class Solution {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(distance(b), distance(a))
        );

        for(int[] point : points) {

            pq.offer(point);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }

    public long distance(int[] point) {

        long x = point[0];
        long y = point[1];

        return x * x + y * y;
    }
}