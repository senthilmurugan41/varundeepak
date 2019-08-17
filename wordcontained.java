import java.util.*;
public class wordcontained 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        if(a.contains(b)) System.out.println("yes");
        else System.out.println("no");
    }
}
