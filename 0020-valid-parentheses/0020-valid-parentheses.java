class Solution {
    public boolean isValid(String s) {
        // HashMap<Character, Character> map = new HashMap<>();
        // map.put('(', ')');
        // map.put('{', '}');
        // map.put('[', ']');
        // ArrayDeque<Character> stk = new ArrayDeque<>();
        // for (int i = 0; i < s.length(); i++) {

        //     if (map.containsKey(s.charAt(i))) {
        //         stk.push(s.charAt(i));
        //     } else {
        //         if (stk.isEmpty()) {
        //             return false;
        //         }
        //         char top = stk.peek();
        //         if (map.get(top) != s.charAt(i)) {
        //             return false;
        //         }
        //         stk.pop();
        //     }
        // }
        // return stk.isEmpty();

        //----------more easy way ------------
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{')
                stk.push('}');
            else if (c == '(')
                stk.push(')');
            else if (c == '[')
                stk.push(']');
            else if (stk.isEmpty() || stk.pop() != c)
                return false;
        }
        return stk.isEmpty();
    }
}