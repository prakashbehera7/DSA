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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        while(temp1!=null && temp2 !=null){
            if(temp1.val<=temp2.val){
                result.next=temp1;
                temp1=temp1.next;
            }
            else{
                result.next=temp2;
                temp2=temp2.next;
            }
            result=result.next;
        }
        while(temp1!=null){
            result.next=temp1;
            result=result.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            result.next=temp2;
            result=result.next;
            temp2=temp2.next;
        }
        return dummy.next;
    }
}