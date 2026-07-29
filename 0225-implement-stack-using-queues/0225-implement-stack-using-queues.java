class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        if (!q1.isEmpty()) {
            int n = q1.size();
            for (int i = 0; i < n - 1; i++) {
                int val = q1.poll();
                q2.offer(val);
            }
        }
        int ans = q1.poll();
        Queue<Integer> temp = q1; // reference swap
        q1 = q2;
        q2 = temp;
        return ans;
    }

    public int top() {
        if (!q1.isEmpty()) {
            int n = q1.size();
            for (int i = 0; i < n - 1; i++) {
                int val = q1.poll();
                q2.offer(val);
            }
        }
        int ans = q1.poll();
        q2.offer(ans);
        Queue<Integer> temp = q1; // reference swap
        q1 = q2;
        q2 = temp;
        return ans;
    }

    public boolean empty() {
        // return q1.size() == 0;
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */