/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         ListNode curr = head.next;
//         ListNode prev = head;
//         ListNode next = curr.next;
//         int count = 2;
//         List<Integer> list = new ArrayList<>();
//         while (curr != null && curr.next != null) {
//             if (curr.val > prev.val && curr.val > next.val)
//                 list.add(count);
//             if (curr.val < prev.val && curr.val < next.val)
//                 list.add(count);
//             count++;
//             prev = curr;
//             curr = curr.next;
//             next = curr.next;
//         }
//         if (list.size() < 2)
//             return new int[] { -1, -1 };
//         int min = Integer.MAX_VALUE;
//         for (int i = 1; i < list.size(); i++) {
//             min = Math.min(min, list.get(i) - list.get(i - 1));
//         }

//         int max = list.get(list.size() - 1) - list.get(0);
//         return new int[] {min,max};
//     }
// }
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int position = 2;

        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            boolean isCritical =
                (curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val);

            if (isCritical) {

                if (first == -1) {
                    // First critical point
                    first = position;
                } else {
                    // Distance from previous critical point
                    minDistance = Math.min(minDistance, position - last);
                }

                last = position;
            }

            prev = curr;
            curr = curr.next;
            position++;
        }

        // Less than 2 critical points
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }

        // Maximum distance = last critical point - first critical point
        int maxDistance = last - first;

        return new int[]{minDistance, maxDistance};
    }
}
