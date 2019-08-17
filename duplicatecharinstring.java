import java.util.*;
public class duplicatecharinstring 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b="";
        int i,j;
        int n=a.length();
        for(i=0;i<n;i++)
        {
            for (j=0; j<i; j++)  
                if (a.charAt(i) == a.charAt(j)) 
                    break;
            if(j == i)
            b+=a.charAt(i);
        }
        System.out.println(b);
    }
}
