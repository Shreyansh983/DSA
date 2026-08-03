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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode prev1 = l2;
        ListNode prev = l1;
        boolean carry = false;
        int a = 0;
        while(prev!=null || prev1 != null || carry==true){
            if(carry) a = 1;
            else a = 0;
            int x = (prev == null) ? 0 : prev.val;
            int y = (prev1 == null) ? 0 : prev1.val;
            int sum =  x + y + a;
            if(sum>9){
                carry = true;
                sum = sum%10;
            }else{
                carry = false;
            }
            temp.next = new ListNode(sum);
            if(prev != null)   prev = prev.next;
            if(prev1 != null)    prev1 = prev1.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}