import java.util.*;
public class presentornot 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        if(a.contains("Vishal") && a.contains("Sundar")) System.out.println("yes");
        else System.out.println("no");
    }
}
