class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int x = target[0];
        int y = target[1];
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0;i<drones.length;i++){
            int a = Math.abs(drones[i][0] - x);
            int b = Math.abs(drones[i][1] - y);
            if(a+b<=drones[i][2]){
                if(a+b<min){
                    min = a+b;
                    ans = i;
                }
            }
        }
        return ans;
    }
}