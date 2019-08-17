import java.util.*;
public class sumofnegative 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
            if(b[i]<0)
            sum+=b[i];
            else continue;
        }
        System.out.println(sum);
    }
}
