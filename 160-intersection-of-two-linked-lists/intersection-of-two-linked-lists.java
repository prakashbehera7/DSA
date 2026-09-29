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
        /*ListNode ptr1=headA;
        ListNode ptr2=headB;
        while(ptr1!=ptr2){
            ptr1=(ptr1==null)?headB:ptr1.next;
            ptr2=(ptr2==null)?headA:ptr2.next;
        }
        return ptr1;*/
        HashSet<ListNode>set=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

}