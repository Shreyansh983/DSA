class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        String res = "";
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for (int right = 0; right < n; right++) {
            need.put(t.charAt(right), need.getOrDefault(t.charAt(right), 0) + 1);
        }

        int matched = 0;
        int left = 0;
        for (int right = 0; right < m; right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                    map.get(c).intValue() == need.get(c).intValue()) {
                matched++;
            }
            while (matched == need.size()) {
                if (res.isEmpty() || (right - left + 1) < res.length()) {
                    res = s.substring(left, right + 1);
                }
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (need.containsKey(s.charAt(left)) && map.get(s.charAt(left)) < need.get(s.charAt(left))) {
                    matched--;
                }
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        return res;
    }
}