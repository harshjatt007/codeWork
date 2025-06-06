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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy,curr=head;
        while(curr!=null && curr.next!=null){
            ListNode npn=curr.next.next;
            ListNode second=curr.next;
            second.next=curr;
            curr.next=npn;
            prev.next=second;
            prev=curr;
            curr=npn;
        }
        return dummy.next;
    }
}