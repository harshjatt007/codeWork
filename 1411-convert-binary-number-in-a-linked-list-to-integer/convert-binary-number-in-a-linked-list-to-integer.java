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
    public int getDecimalValue(ListNode head) {
        // int num=0
        StringBuilder sb=new StringBuilder();
        while(head!=null){
            // num=num*10+head.val;
            sb.append(String.valueOf(head.val));
            head=head.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}