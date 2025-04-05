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
    public int pairSum(ListNode head) {
        Stack<Integer>stack=new Stack<>();
        ListNode dummy=head;
        while(dummy!=null){
            stack.push(dummy.val);
            dummy=dummy.next;
        }
        int maxTwinSum=Integer.MIN_VALUE;
        while(head!=null){
            maxTwinSum=Math.max(maxTwinSum,head.val+stack.pop());
            head=head.next;
        }
        return maxTwinSum;
    }
}