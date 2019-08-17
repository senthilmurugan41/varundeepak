import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        for(int i=0;i<a.length();i=i+3) System.out.print(a.charAt(i));
    }
}
