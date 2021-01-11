import java.util.*;
import java.util.Collections;
class comp implements Comparator<Integer>
{
public int compare(Integer a,Integer b)
{
if(a>b)
return -1;
else
{
if(a<b)
return 1;
else
return 0;
}
}
}
public class fairraj{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int m=sc.nextInt();
int sum1=0;
int sum2=0;
int[] ar1=new int[n];
Integer[] ar2=new Integer[m];
for(int i=0;i<n;i++)
{
int l=sc.nextInt();
sum1=sum1+l;
ar1[i]=l;
}
for(int i=0;i<m;i++)
{
int l=sc.nextInt();
sum2=sum2+l;
ar2[i]=l;
}
int c=0;
if(sum1>sum2)
{
System.out.println(0);
}
else
{
Arrays.sort(ar1);
Arrays.sort(ar2,new comp());
int i=0;
while(i<n && i<m)
{
if(sum1>sum2)
break;
if(ar1[i]>=ar2[i])
{
break;
}
sum1=sum1-ar1[i]+ar2[i];
sum2=sum2-ar2[i]+ar1[i];
c++;
i++;
}
if(sum1>sum2)
System.out.println(c);
else
System.out.println(-1);
}
t--;
}
}
}