import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrange_Array_Alternately {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a-->0)
		{
		    int b=sc.nextInt();
		    int c[]=new int[b];
		    for(int i=0;i<b;i++)
		    {
		        c[i]=sc.nextInt();
		    }
		    int i=0,j=c.length-1,l=0;
		   ArrayList<Integer> d=new ArrayList<>();
		    while(i<j)
		    {
		        d.add(l,c[j]);
		        l++;
		        d.add(l,c[i]);
		        i++;
		        j--;
		        l++;
		    }
		    if(c.length%2!=0)
		    {
		        int e=c.length/2;
		        d.add(c.length-1,c[e]);
		    }
		    for(i=0;i<d.size();i++)
		    {
		        System.out.print(d.get(i)+" ");
		    }
		    System.out.println();
		    d.clear();
		}
	}
}