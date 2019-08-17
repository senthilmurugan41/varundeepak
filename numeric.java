import java.util.*;
public class numeric
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        try{String a=s.nextLine();
        double b=Double.parseDouble(a);
        System.out.println("yes");}
        catch(Exception e)
        {
            System.out.println("no");
        }
    }
}
