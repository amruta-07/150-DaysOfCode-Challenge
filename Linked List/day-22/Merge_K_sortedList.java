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
    public ListNode mergeKLists(ListNode[] lists) {
        List <Integer> list=new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            ListNode head=lists[i];
            while(head!=null){
                list.add(head.val);
                    head=head.next;
            }
            
            
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0); //converted integer to ListNode
        ListNode temp=dummy;
        for(int i=0; i<list.size(); i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return dummy.next;
        
    }
}

//[1,4,5,1,3,4,2,6]
// [1,1,2,3,4,4,5,6]