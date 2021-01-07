import java.util.*;
import java.io.*;
import java.lang.*;

class encoding
{
    public static void main(String arr[])
    {
       Scanner sc=new Scanner (System.in);
        
        int i,j,t;
        char car='a';
     
        String ar[]=new String[]
        {
        	"0000",
        	"0001",
        	"0010",
        	"0011",
        	"0100",
        	"0101",
        	"0110",
        	"0111",
        	"1000",
        	"1001",
        	"1010",
        	"1011",
        	"1100",
        	"1101",
        	"1110",
        	"1111",
        	

        };
        //System.out.println("Enter any number");
        t=sc.nextInt();
        for (i=0;i<t;i++) {
        	int size=sc.nextInt();
        	sc.nextLine();
        	String s=sc.nextLine();
        	j=0;
        	while(j<=size-4){
        		String sub1=s.substring(j,j+4);
        		j+=4;
        		
        		for (int k=0;k<16;k++ ) 
        		if (sub1.equals(ar[k]))
        			car+=k;

        	System.out.print(car);
        	car='a';

        	}
        	
        	System.out.println();
        	
        }
        
    }
}
