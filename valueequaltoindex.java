import java.util.*;
public class valueequaltoindex 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==i)
            {
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if(count<=0) System.out.println("-1");
    }
}
