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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1 && n==1){
            return null;
        }
        int total=size-n;
        if(total<1){
            head=head.next;
            return head;
        }
        ListNode pre=head;
        for(int i=0; i<total-1; i++){
            pre=pre.next;
        }
        System.out.println(pre.val);
        pre.next=pre.next.next;
        return head;
        
    }
}