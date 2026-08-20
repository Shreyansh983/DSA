class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stack.isEmpty()){
                    char a = stack.pop();
                    sb.delete(sb.length()-1,a);
                }
            }
            else{
                stack.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }

        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stack2.isEmpty()){
                    char a = stack2.pop();
                    tb.delete(tb.length()-1,a);
                }
            }else{
                stack2.push(t.charAt(i));
                tb.append(t.charAt(i));
            }
        }

        System.out.println(sb + " " + tb);

        return tb.toString().equals(sb.toString());
    }
}