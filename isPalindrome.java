 head =[1,2,2,1]
 Output::true
  
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
        ListNode mid=midNode(head);
        ListNode headmid=revNode(mid);
        ListNode reverseHead=headmid;

        while(head!=null && headmid !=null)
        {
            if(head.val != headmid.val)
            {
                break;
            }
            head=head.next;
            headmid=headmid.next;
        }
        revNode(reverseHead);
        return head==null||headmid==null;
        
    }

    public static ListNode midNode(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static ListNode revNode(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present != null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }

        }
        return prev;
    }
}
