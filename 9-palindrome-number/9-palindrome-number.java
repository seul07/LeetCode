class Solution {
    public boolean isPalindrome(int x) {
         String t = x+"";
        int lt = 0;
        int rt = t.length()-1;
        boolean result = true;
        while(lt<rt){
            if(t.charAt(lt)!=t.charAt(rt)) result = false;
            lt++;
            rt--;
        }
        return result;
        
    }
}