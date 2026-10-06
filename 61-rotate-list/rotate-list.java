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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        tail.next=head;
        int steps=n-k-1;
        ListNode temp=head;
        while(steps>0){
            temp=temp.next;
            steps--;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;
    }
}