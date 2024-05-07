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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> s = new Stack<Integer>();
        
        while(head!=null){
            s.push(head.val);
            head = head.next;
        }
        ListNode tail = null;
        int res = 0;
        while(!s.isEmpty() || res!=0){
            tail = new ListNode(0,tail);
            if(!s.isEmpty()){
                res = res + s.pop() * 2;
            }
            tail.val = res%10;
            res /= 10;
        }

        return tail;
    }
}