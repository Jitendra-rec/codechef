import java.util.*;
import java.io.*;
import java.lang.*;

class poi
{
    public static void main(String arr[])
    {
       Scanner sc=new Scanner (System.in);

        int test,turn,i,n,x,y;
        
        test=sc.nextInt();
        for (i=0;i<test;i++) 
    {
         n=sc.nextInt();
         turn=sc.nextInt();
         x=sc.nextInt();
         y=sc.nextInt();
         while(turn>0)
        {
         	int a,b,c=1;
         	System.out.println("turn 1");
         	if(x<n&&y<n)
         	{
         		 a=n-x;
         		 b=n-y;
         		a=a<b?a:b;
         		x+=a;
         		y+=a;
         		turn--;
         		System.out.println("step "+c++);
         		if(turn>=0)
         		{
         			System.out.println(x+" "+y);
         			//break;
         		}
         	}
         	System.out.println("turn 2");
         	if(x>0||y<5)
         	{
         		a=x;
         		b=n-y;
         		a=a<b?a:b;
         		x=-a;
         		y=+a;
         		turn--;
         		System.out.println("step "+c++);
         		if(turn>=0)
         		{
         			System.out.println(x+" "+y);
         			//break;
         		}

         	}
         	System.out.println("turn 3");
         	if(x>0||y>0)
         	{
         		a=x;
         		b=y;
         		a=a<b?a:b;
         		x=-a;
         		y=-a;
         		turn--;
         		System.out.println("step "+c++);
         		if(turn>=0)
         		{
         			System.out.println(x+" "+y);
         			//break;
         		}

         	}
         	System.out.println("turn 4");
         	if(x<n||y>0)
         	{
         		a=n-x;
         		b=y;
         		a=a<b?a:b;
         		x=+a;
         		y=-a;
         		turn--;
         		System.out.println("step "+c++);
         		if(turn>=0)
         		{
         			System.out.println(x+" "+y);
         			//break;
         		}

        }	}
     }
 }}

