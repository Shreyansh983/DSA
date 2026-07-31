class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }

        List<Integer> arr = new ArrayList<>();
        for (Integer value : map.values()) {
            arr.add(value);
        }
        Collections.sort(arr, Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i <= 7)
                count += arr.get(i);
            else if (i <= 15 && i > 7) {
                count += arr.get(i)*2;
            }else if(i <= 23 && i > 15){
                count += arr.get(i)*3;
            }else{
                count += arr.get(i)*4;
            }
        }

        return count;
    }
}