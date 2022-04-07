class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : stones){
            priorityQueue.add(n);
        }
        int result = stones[0];
        while(priorityQueue.size()>1){
            int max = priorityQueue.poll();
            int secMax = priorityQueue.poll();
            priorityQueue.add(max-secMax);
            result = priorityQueue.peek();
        }

        return result;
    }
}