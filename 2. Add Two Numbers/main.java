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
        int carry = 0;
        ListNode l1_head = l1;
        ListNode l2_head = l2;
        boolean isL1Longer = true;

        while(l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            
            int value = a + b + carry;
            carry = value > 9 ? 1 : 0;
            
            if(l1 != null) {
                isL1Longer = true;
                if(l1.next == null && carry == 1) {
                    l1.next = new ListNode(carry);
                    carry = 0;
                }
                l1.val = value % 10;
                l1 = l1.next;
            }

            if(l2 != null) {
                isL1Longer = false;
                if(l2.next == null && carry == 1) {
                    l2.next = new ListNode(carry);
                    carry = 0;
                }
                l2.val = value % 10;
                l2 = l2.next;
            }
        }
        return isL1Longer ? l1_head : l2_head;
    }
}