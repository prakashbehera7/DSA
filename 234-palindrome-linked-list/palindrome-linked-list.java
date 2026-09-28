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
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null){
            System.out.println("List is empty.");
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode firstHalf=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow.next);
        ListNode temp=secondHalf;
        while(temp!=null){
            if(firstHalf.val!=temp.val){
                return false;
            }
            firstHalf=firstHalf.next;
            temp=temp.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
        ListNode dummy=current.next;
        current.next=prev;
        prev=current;
        current=dummy;
        }
        return prev;
    }
}