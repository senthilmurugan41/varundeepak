import java.util.*;
public class maxof10 {
    public static void main(String args[] )
    {
        Scanner s=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++) a[i]=s.nextInt();
        Arrays.sort(a);
        System.out.println(a[9]);
    }
}
	
