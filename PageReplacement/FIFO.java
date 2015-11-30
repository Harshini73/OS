import java.util.Scanner;
//import java.util.Arrays;
public class FIFO {
	public static void main(String []args)
	{
		int i,frame,count;
	    Scanner in =new Scanner(System.in);
	    frame=in.nextInt();
	    int n=in.nextInt();
	    int [] b=new int[frame];
	    int [] a=new int[n];
	    for(i=0;i<n;i++)
	    {
	    	a[i]=in.nextInt();
	    	
	    }
	    in.close();
	    for(i=0;i<frame;i++)
	    {
	    	b[i]=a[i];
	    }
	    count=frame;
	    int j=0,k,f=0;
	    for(i=frame;i<n;i++)
	    {f=0;
	    	for(k=0;k<frame;k++)
	    	{
	    		if(b[k]==a[i])
	    		{
	    			f=1;
	    			break;
	    		}
	    	}
	    	if(f==0)
	    	{
	    		count++;
	    		b[j]=a[i];
	    		j++;
	    	}
	    	
	    	if(j==frame)
	    		j=0;
	    }
	    System.out.println(count);
	    
	}
}
	
