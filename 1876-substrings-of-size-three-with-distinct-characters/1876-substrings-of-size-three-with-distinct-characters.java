class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int count = 0;
        for(int j = 0;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(j-i+1>3){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            if(map.size()==3 && j-i+1==3) count++;
        }
        return count;
    }
}
//xyzzaz
//