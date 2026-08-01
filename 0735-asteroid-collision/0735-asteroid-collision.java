class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();
        for (int ast : asteroids) {
            boolean alive = true;
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int a = Math.abs(stack.peek());
                int b = Math.abs(ast);
                if (b > a) {
                    stack.pop();
                } else if (b == a) {
                    alive = false;
                    stack.pop();
                    break;
                } else {
                    alive = false;
                    break;
                }
            }
            if (alive)
                stack.push(ast);
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}