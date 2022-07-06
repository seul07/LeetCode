class Solution {
    public int fib(int n) {
        int cur=0,next=1,tmp;
        while(n>0){
            tmp=next+cur;
            next=cur;
            cur=tmp;
            n--;
        }
        return cur;
    }
}