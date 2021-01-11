import java.util.*;
import java.io.*;
import java.lang.*;

class fairelection
{
    public static void main(String arr[])
    {
       Scanner sc=new Scanner (System.in);

        int t,i,n,m,j,k,sn,sm;
        System.out.println("Enter test cases");
        t=sc.nextInt();
        for (i=0;i<t;i++) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int an[]=new int[n]
        int am[]=new int[m]
        for (j=0;j<n ;j++ ) {
            an[j]=sc.nextInt();
            sn=sn+an[j];
        }

        for (k=0;k<m ;k++ ) {
            am[k]=sc.nextInt();
            sm=sm+am[j];
        }

        
        Arrays.sort(an);
        Arrays.sort(am);
        
    }
}
