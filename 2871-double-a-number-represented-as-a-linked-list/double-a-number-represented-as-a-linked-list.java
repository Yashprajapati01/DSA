/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        int frem = 0;

        if (temp != null && temp.val >= 5) {
            frem = 1;
        }
        while (temp != null && temp.next != null) {
            int value1=temp.val;
            if (temp.next.val >= 5) {
                int result = value1 * 2 + 1;
                int lastDigit = result % 10;
                temp.val = lastDigit;
            } else {
                int result = value1 * 2;
                int lastDigit = result % 10;
                temp.val = lastDigit;
            }
            temp = temp.next;
        }
        if (temp != null) {
            temp.val = (temp.val * 2) % 10;
        }
        if (frem == 1) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            head = newHead;
        }
        return head;

    }
}