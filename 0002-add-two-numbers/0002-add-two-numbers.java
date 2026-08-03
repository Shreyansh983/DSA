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

        ListNode curr2 = l2;
        ListNode curr1 = l1;
        boolean carry = false;
        int a = 0;
        while(curr1!=null || curr2 != null || carry==true){
            if(carry) a = 1;
            else a = 0;
            int x = (curr1 == null) ? 0 : curr1.val;
            int y = (curr2 == null) ? 0 : curr2.val;
            int sum =  x + y + a;
            if(sum>9){
                carry = true;
                sum = sum%10;
            }else{
                carry = false;
            }
            temp.next = new ListNode(sum);
            if(curr1 != null)   curr1 = curr1.next;
            if(curr2 != null)    curr2 = curr2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}