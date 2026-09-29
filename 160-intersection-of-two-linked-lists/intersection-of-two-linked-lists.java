/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int len1=getLength(temp1);
        int len2=getLength(temp2);
        if(len1<len2){
            int diff=len2-len1;
            while(diff>0){
                ptr2=ptr2.next;
                diff--;
            }
        }
        else if(len1>len2){
            int diff=len1-len2;
            while(diff>0){
                ptr1=ptr1.next;
                diff--;
            }
        }
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
    public int getLength(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
}