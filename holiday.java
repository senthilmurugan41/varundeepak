import java.util.*;
public class holiday
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        if(a.equals("Saturday") || a.equals("Sunday")) System.out.println("yes");
        else System.out.println("no");
    }
}
