class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Double> map = new HashMap<>();
        for(int i =0;i<position.length;i++){
            double time = (double)(target - position[i])/speed[i];
            map.put(position[i],time);
        }
        Arrays.sort(position);
        double prevTime = map.get(position[position.length-1]);
        int count = 1;
        System.out.println(map);
        for(int i = position.length-2;i>=0;i--){
            double currentTime = map.get(position[i]);
            if(prevTime<currentTime){
                prevTime = currentTime;
                count++;
            }
        }
        return count;
    }
}