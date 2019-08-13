import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int c=a.length();
        char[] b=new char[c];
        for(int i=0;i<c;i++) b[i]=a.charAt(i);
        int count=0;
        for(int i=0;i<c;i++)
        {
            if(b[i]==' ') continue;
            count++;
        }
        System.out.println(count);
    }
}
