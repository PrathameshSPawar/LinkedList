/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val){ this.val = val; }
 *     ListNode(int val,ListNode next){ this.val = val; this.next = next; }
 * }
 */

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
    
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        {
            return head;
        }

        ListNode prev=null;
        ListNode current=head;
        for(int i=0;i<left-1;i++)
        {
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode leftEnd=current;
        ListNode next=current.next;

        for(int i=0;i<right-left+1;i++)
        {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
            {
                next=next.next;
            }
        }

        if(last!=null)
        {
            last.next=prev;
        }else{
            head=prev;
        }

        leftEnd.next=current;
        return head;
    }
}
