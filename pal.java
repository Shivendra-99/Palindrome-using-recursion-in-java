
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String pal(int a)
    {
        if(a>=0 && a<=9)
        {
            return "Yes";
        }
        int l=a;
        int g=a;
        String f=String.valueOf(l);
        int e=f.length();
        int c[]=new int[e];
        int i=0;
        while(a>0)
        {
            c[i]=a%10;
            a=a/10;
            i++;
        }
        for(i=c.length-1;i>=0;i--)
        {
            if(c[i]!=g%10)
            {
                return "No";
            }
            g=g/10;
        }
       
        return "Yes";
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a-->0)
		{
		    int b=sc.nextInt();
		    System.out.println(pal(b));
		}
	}
}
