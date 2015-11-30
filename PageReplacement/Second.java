
import java.util.Scanner;
//import java.util.Arrays;
public class Second{
        public static void main(String []args)
        {
                int i,frame,count;
                Scanner in =new Scanner(System.in);
                frame=in.nextInt();
                int n=in.nextInt();
                int [] b=new int[frame];
                int [] a=new int[n];
                int [] s=new int[n];
                for(i=0;i<n;i++)
                {
                        a[i]=in.nextInt();
                }
                in.close();
                for(i=0;i<frame;i++)
                {
                        b[i]=a[i];
                }
                count=frame-1;
                int j=0,k,f=0;
                for(i=frame;i<n;i++)
                {f=0;
                        for(k=0;k<frame;k++)
                        {
                                if(b[k]==a[i])
                                {
                                        if(s[k]==0)
                                          {
                                            s[k]=1;
                                          }
                                        else if(s[k]==1)
                                          {
                                             s[k]=0;
                                          }
                                        f=1;
                                        break;
                                }
                        }
                        while(f==0)
                        {
                            if(s[j]==1)
                              { j=j+1;
                               j=j%3;}
                             else{
                                count++;
                                b[j]=a[i];
                                j++;
                                j=j%3;
                                  f=1;}
                        }
                        if(j==frame)
                                j=0;
                }
                System.out.println(count);

        }
}
