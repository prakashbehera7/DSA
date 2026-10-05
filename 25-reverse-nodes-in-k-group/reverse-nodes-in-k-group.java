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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
                ListNode kthNode=getKthNode(temp,k);
                if(kthNode==null){
                    if(prevNode!=null){
                        prevNode.next=temp;
                    }
                    break;
                }
                ListNode nextNode=kthNode.next;
                kthNode.next=null;
                reverse(temp);
                if(temp==head){
                    head=kthNode;
                }
                else{
                    prevNode.next=kthNode;
                }
                prevNode =temp;
                temp=nextNode;
        }
        return head;
    }
    private ListNode getKthNode(ListNode temp,int k){
        k--;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    private void reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
}