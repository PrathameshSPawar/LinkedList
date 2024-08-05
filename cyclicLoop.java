//if cycle present then give true else false!!!!
public class ListCycle{
  public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }
        }
    
        return false;
    }
//Count the total elements in cycle
public int lengthCycle(Node head)
{
    Node fast=head;
    Node slow=head;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {
            Node temp=slow;
            int length=0;
            do{
                temp=temp.next;
                length+=1;
            }while(temp!=slow);
            return length;
        }
    }
    return 0;
}
