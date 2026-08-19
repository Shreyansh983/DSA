class Solution {
    public int maxNumberOfFamilies(int n, int[][] reserved) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < reserved.length; i++) {
            int row = reserved[i][0];
            int clm = reserved[i][1];
            Set<Integer> set = map.getOrDefault(row, new HashSet<>());
            set.add(clm);
            map.put(row, set);
        }

        int ans = (n - map.size()) * 2;
        for (Set<Integer> set : map.values()) {
            // boolean left = true;
            // boolean middle = true;
            // boolean right = true;

            // for (int seat = 2; seat <= 5; seat++) {
            //     if (set.contains(seat)) {
            //         left = false;
            //         break;
            //     }
            // }
            // for (int seat = 4; seat <= 7; seat++) {
            //     if (set.contains(seat)) {
            //         middle = false;
            //         break;
            //     }
            // }
            // for (int seat = 6; seat <= 9; seat++) {
            //     if (set.contains(seat)) {
            //         right = false;
            //         break;
            //     }
            // }
            boolean left  = !set.contains(2) && !set.contains(3)
                         && !set.contains(4) && !set.contains(5);

            boolean middle = !set.contains(4) && !set.contains(5)
                          && !set.contains(6) && !set.contains(7);

            boolean right = !set.contains(6) && !set.contains(7)
                         && !set.contains(8) && !set.contains(9);
            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}