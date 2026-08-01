class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for (int ast : asteroids) {
            boolean alive = true;
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int a = Math.abs(stack.peek());
                int b = Math.abs(ast);
                if (b > a) {
                    stack.pop();
                }else if(b==a){
                    alive = false;
                    stack.pop();
                    break;
                }else{
                    alive = false;
                    break;
                }
            }
            if(alive) stack.push(ast);
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}