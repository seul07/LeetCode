class Solution {
    public int romanToInt(String s) {
          int answer=0;
        int last=0;
        for (int i = 0; i < s.length(); i++) {
            int now=0;
            switch (s.charAt(i)){
                case 'I':
                    now = 1;
                    break;
                case 'V':
                    now = 5;
                    break;
                case 'X':
                    now = 10;
                    break;
                case 'L':
                    now = 50;
                    break;
                case 'C':
                    now = 100;
                    break;
                case 'D':
                    now = 500;
                    break;
                case 'M':
                    now = 1000;
                    break;
            }
            answer = (last <now) ? (answer - last*2 +now) : (answer + now);
            last = now;
           
        }
         return answer;
    }
}