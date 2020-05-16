package Week3;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
*/


class Solution {
    public ListNode oddEvenList(ListNode head) {
        
       if (head != null) {
    
        ListNode odd = head, even = head.next, evenHead = even; 
    
        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead; 
    }
    return head;
        
    }
}