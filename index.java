import java.util.*;
class index 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++) b[i]=s.nextInt();
        for(int i=0;i<a;i++) System.out.println(b[i]+" "+i);
    }
}
