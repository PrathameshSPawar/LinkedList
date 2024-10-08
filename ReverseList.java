public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode present=head;

        while(present!=null)
        {
            ListNode next=present.next;
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
