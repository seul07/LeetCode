class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
               stack.push(s.charAt(i));
           }else{
               if(!stack.isEmpty()){
                   char tmp = stack.pop();
                   if(s.charAt(i)==')' && tmp=='(' || s.charAt(i)=='}' && tmp=='{' || s.charAt(i)==']' && tmp =='['){
                       result = true;
                   }else{
                       return false;
                   }
               }else{
                   return false;
               }
           }
        }

        if(!stack.isEmpty())result = false;
        return result;
    }
}