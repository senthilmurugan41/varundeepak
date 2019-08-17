import java.util.*;
public class noofnumbers {
    public static void main(String args[] )
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int c=a.length();
        char[] b=new char[c];
        for(int i=0;i<c;i++) b[i]=a.charAt(i);
        int count=0;
        for(int i=0;i<c;i++)
        {
            if(Character.isDigit(b[i])) 
            count++;
            else continue;
        }
        System.out.println(count);
    }
}
