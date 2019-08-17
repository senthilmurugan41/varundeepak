import java.util.*;
public class checkarmstrong 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int c,d=0;
        while(a>0)
        {
            c=a%10;
            a=a/10;
            d=d+(c*c*c);
        }
        if(b==d) System.out.println("yes");
        else System.out.println("no");
    }
}
