class Solution {
    public int lastStoneWeight(int[] stones) {
         List<Integer> list= Arrays.stream(stones).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
        int result = stones[0];
        while(list.size()>1){
            int max = list.get(0);
            int secMax = list.get(1);
            list.add(max-secMax);
            list.remove(0);
            list.remove(0);
            list.sort(Comparator.reverseOrder());
            result = list.get(0);
        }
        return result;
    }
}