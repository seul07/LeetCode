class Solution {
    public void reverseString(char[] s) {
        int lf = 0;
        int rf = s.length-1;
        while(lf<rf){
            char lfTmp = s[lf];
            char rfTmp = s[rf];
            char tmp = ' ';
            tmp = rfTmp;
            s[rf] = lfTmp;
            s[lf] = tmp;
            lf++;
            rf--;
        }

        System.out.println(Arrays.toString(s));
    }
}