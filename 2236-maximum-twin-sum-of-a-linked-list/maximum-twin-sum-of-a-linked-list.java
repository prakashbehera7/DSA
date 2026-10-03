class Solution {
    public int pairSum(ListNode head) {

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Find maximum twin sum
        ListNode left = head;
        ListNode right = prev;

        int twinSum = 0;

        while (right != null) {
            int total = left.val + right.val;

            if (total > twinSum) {
                twinSum = total;
            }

            left = left.next;
            right = right.next;
        }

        return twinSum;
    }
}