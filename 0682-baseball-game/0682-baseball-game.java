class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for(int i = 0;i<operations.length;i++){
            String ch = operations[i];
            if(!ch.equals("C") && !ch.equals("D") && !ch.equals("+")){
                stack.push(Integer.parseInt(ch));
                sum += stack.peek();
            }else if(ch.equals("C")){
                int value = stack.pop();
                sum -= value;
            }else if(ch.equals("D")){
                int value = stack.peek() * 2;
                stack.push(value);
                sum += value;
            }else{
                int top = stack.pop();
                int prev = stack.peek();
                stack.push(top);  
                stack.push(top+prev);
                sum += top+prev; 
            }
        }
        return sum;
    }
}