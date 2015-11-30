import java.util.Scanner;
//import java.util.Arrays;
public class Optimal {
        public static void main(String []args)
        {
            int i,j,pagefault,count,x;
            Scanner in =new Scanner(System.in);
            //head=in.nextInt();
            pagefault=-1;
            int n=in.nextInt();
            int [] a=new int[n];
            int [] hash=new int[100];
            for(i=0;i<n;i++)
            {
            	hash[i]=0;
            }
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
                x=a[i];
                count=hash[x];
                hash[x]=count++;
            }
            //System.out.println("Head ="+head);
           // for(i=0;i<n;i++)
           // {
             //   System.out.println("Disk"+a[i]);
           // }
            in.close();
            int [] frames=new int[3];
            int f,min,k,l,val_l,val_f,p;
            frames[0]=a[0];
            hash[a[0]]--;
            frames[1]=a[1];
            hash[a[1]]--;
            frames[2]=a[2];
            hash[a[2]]--;
            for(j=3;j<n;j++)
            { f=0;
            	//if(a[j]==frames[0]||a[j]==frames[1]||a[j]==frames[2])
            	for(i=0;i<3;i++)
            	{
            		if(frames[i]==a[j])
            		{
            			f=1;
            		}
            	}
            	if(f==0)
            	{ 
            		min=hash[0];
            		k=0;
            		val_f=frames[0];
            		for(i=1;i<3;i++)
            		{
            			if(hash[frames[i]]<min)
            			{
            				min=hash[frames[i]];
            				k=i;
            			}
            			if(hash[frames[i]]==min)
            			{  
            				val_l=frames[i];
            				for(l=n-1;l>=1;l--)
            				{
            				   	if(a[l]==val_f)
            				   	{
            				      k=0;
            				      break;
            				   	}
            				   	else if(a[l]==val_l)
            				   	{
            				   		k=i;
            				   		break;
            				   	}
            				}
            			}
            		}
            		pagefault++;
            		frames[k]=a[j];
            		hash[a[j]]--;
            	}
            		
            		
            	
            }
            
            System.out.println(pagefault);
           
        }
}
