class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch) stack.pop();
            else stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.removeLast();
            sb.append(c);
        }
        return sb.toString();
    }
}