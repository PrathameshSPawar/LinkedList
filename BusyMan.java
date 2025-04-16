import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int t=0;
	    Scanner pp=new Scanner(System.in);
	    t=pp.nextInt();
	    while(t-->0)
	    {
	       int ans=1;
	       int n=pp.nextInt();
	       List<List<Integer>> task=new LinkedList<>();
	       for(int i=0;i<n;i++)
	       {
	           List<Integer> list=new LinkedList<>();;
	           int fi=pp.nextInt();
	           int se=pp.nextInt();
	           list.add(fi);
	           list.add(se);
	           task.add(list);
	       }
	       
	       task.sort(Comparator.comparingInt(a -> a.get(1)));
	       List<Integer> latest=task.get(0);
	       int first=latest.get(0),second=latest.get(1);
	       for(int i=1;i<n;i++)
	       {
	           List<Integer> curr=task.get(i);
	           int sec=curr.get(1),fir=curr.get(0);
	           if(second<=fir)
	           {
	               second=sec;
	               ans++;
	           }
	       }
	       System.out.println(ans);
	    }
	}
}
