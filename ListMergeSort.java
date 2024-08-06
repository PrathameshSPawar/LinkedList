Input: head = [4,2,1,3]
Output: [1,2,3,4]
public class MergeSort {
    private ListNode midOne(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode midPrevious = null;

        while (fast != null && fast.next != null) {
            midPrevious = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        if (midPrevious != null) {
            midPrevious.next = null;
        }
        return slow;
    }
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = midOne(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeList(left, right);
    }

    public ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode dupliHead = new ListNode(0);
        ListNode node = dupliHead;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                node.next = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }
        while (list1 != null) {
            node.next = list1;
            list1 = list1.next;
            node = node.next;
        }
        while (list2 != null) {
            node.next = list2;
            list2 = list2.next;
            node = node.next;
        }
        return dupliHead.next;
    }
}
