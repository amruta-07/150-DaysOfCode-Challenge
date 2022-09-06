/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    private ListNode head, last;
    private int carry;

    public Solution() {
        carry = 0;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            if (head == null && last == null) {
                ListNode newNode = new ListNode(value % 10);
                newNode.next = null;
                head = newNode;
                last = newNode;
            } else {
                ListNode newNode = new ListNode(value % 10);
                newNode.next = null;
                last.next = newNode;
                last = last.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int num = l1.val + carry;
            carry = num / 10;
            ListNode newNode = new ListNode(num % 10);
            newNode.next = null;
            last.next = newNode;
            last = last.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int num = l2.val + carry;
            carry = num / 10;
            ListNode newNode = new ListNode(num % 10);
            newNode.next = null;
            last.next = newNode;
            last = last.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry % 10);
            newNode.next = null;
            last.next = newNode;
            last = last.next;
        }
        return head;
    }
}