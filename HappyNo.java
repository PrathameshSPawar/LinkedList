Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
  
public class IsHappy {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;

        do{
            slow=findSqu(slow);
            fast=findSqu(findSqu(fast));
        }
        while(slow!=fast);

        if(slow==1)
        {
            return true;
        }
        return false;
    }

    public int findSqu(int n)
    {
        int ans=0;
        while(n>0)
        {
            int remi=n%10;
            ans=ans+remi*remi;
            n=n/10;
        }
        return ans;
    }
}
