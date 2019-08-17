import java.util.*;
import java.io.*;
public class alternatesort 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        Arrays.sort(a);
        int i = 0, j = n-1; 
        while (i < j) 
        { 
            System.out.print(a[j--] + " "); 
            System.out.print(a[i++] + " "); 
        } 
        if (n % 2 != 0) 
            System.out.print(a[i]);
    }
}
