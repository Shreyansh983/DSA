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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s = "";
        String s1 = "";
        ListNode temp = l1;
        ListNode temp1 = l2;
        while (temp != null) {
            s += temp.val;
            temp = temp.next;
        }
        while (temp1 != null) {
            s1 += temp1.val;
            temp1 = temp1.next;
        }
        // long sum = Long.parseLong(s) + Long.parseLong(s1);
        BigInteger num1 = new BigInteger(s);
        BigInteger num2 = new BigInteger(s1);
        BigInteger sum = num1.add(num2);
        String ans = String.valueOf(sum);
        ListNode sol = new ListNode(0);
        ListNode t = sol;
        for (int i = 0; i < ans.length(); i++) {
            int cur = ans.charAt(i) - '0';
            t.next = new ListNode(cur);
            t = t.next;
        }
        return sol.next;
    }
}