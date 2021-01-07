import java.util.*;
import java.io.*;
import java.lang.*;

class div3
{
    public static void main(String arr[])
    {
       Scanner sc=new Scanner (System.in);
        
        int t,i;
        System.out.println("Enter test cases");
        t=sc.nextInt();
        for (i=0;i<t;i++) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int d=sc.nextInt();
        	int c=0,j;
        	int a[]=new int[n];
        	for (j=0;j<n;j++ ) 
        		a[j]=sc.nextInt();
        	for (j=0;j<n ;j++ ) {
        		c=c+a[j];
        		//System.out.println("division"+c/k);
        	}
        	if(c/k<d)
        		System.out.println(c/k);
        	else
        		System.out.println(d);

        	
        }
    }
}
