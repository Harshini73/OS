import java.util.Scanner;
//import java.util.Arrays;
public class LRU {
        public static void main(String []args)
        {
            int i,j,pagefault;
            Scanner in =new Scanner(System.in);
            //head=in.nextInt();
            pagefault=-1;
            int n=in.nextInt();
            int [] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            //System.out.println("Head ="+head);
           // for(i=0;i<n;i++)
           // {
             //   System.out.println("Disk"+a[i]);
           // }
            in.close();
            int [] frames=new int[3];
            frames[0]=a[0];
            frames[1]=a[1];
            frames[2]=a[2];
            for(j=3;j<n;j++)
            {
            	//if(a[j]==frames[0]||a[j]==frames[1]||a[j]==frames[2])
            	if(a[j]==frames[0])
            	{
            	frames[0]=frames[1];
            	frames[1]=frames[2];
            	frames[2]=a[j];
     
            	}
            	else if(a[j]==frames[1])
            	{
            		frames[1]=frames[2];
            		frames[2]=a[2];
            	}
            	else if(a[j]==frames[2])
            	{
            		//do nothing
            	}
            	else
            	{
            		frames[0]=frames[1];
                	frames[1]=frames[2];
                	frames[2]=a[j];
                	pagefault++;
                	//System.out.println(a[j]+pagefault);
            	}
            	
            }
            
            System.out.println(pagefault);
           
        }
}
