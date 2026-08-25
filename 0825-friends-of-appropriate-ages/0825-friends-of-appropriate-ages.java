/* --- Naive Solution----------
class Solution {
    public int numFriendRequests(int[] ages) {
        int count = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i == j)
                    continue;

                if (requestSend(ages[i], ages[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean requestSend(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false;

        return true;
    }
}*/

class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];

        // Count people of each age
        for (int age : ages) {
            count[age]++;
        }

        int ans = 0;

        // x = sender's age
        for (int x = 1; x <= 120; x++) {

            if (count[x] == 0) {
                continue;
            }

            // y = receiver's age
            for (int y = 1; y <= 120; y++) {

                if (count[y] == 0) {
                    continue;
                }

                if (y <= 0.5 * x + 7) {
                    continue;
                }

                if (y > x) {
                    continue;
                }

                if (y > 100 && x < 100) {
                    continue;
                }

                ans += count[x] * count[y];

                // Don't allow x to send to themselves
                if (x == y) {
                    ans -= count[x];
                }
            }
        }

        return ans;
    }
}