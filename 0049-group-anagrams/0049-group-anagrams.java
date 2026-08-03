class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key -> sort sring hai jaise eat tea ate -> aet ban jayega aur key bhi aet rahega
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray(); // for sorting
            Arrays.sort(chars);
            String sorted = new String(chars);

            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(s);
            map.put(sorted, list);
        }

        return new ArrayList<>(map.values());
    }
}