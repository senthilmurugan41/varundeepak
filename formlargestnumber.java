import java.util.*;
public class formlargestnumber 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        int i,j;
        Arrays.sort(a);
        for(i=0,j=n-1;i<n&&j>=0;i++,j--) b[i]=a[j];
        for(i=0;i<n;i++) System.out.print(b[i]);
        
    }
}
