import java.util.Scanner;
public class Pattren10
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int row=0;
            if(t%2==0)
            {
                row=t;
            }
            else
            {
                row=t+1;
            }
            int num=row/2;
            int space=1;
            int k=0;

            for(int i=1;i<row;i++)
            {
                if(i<row/2)
                {
                    for ( int j = 1; j < space; j++)
                    {
                        System.out.print(" ");
                    }
                    for( k=i;k<=num;k++)
                    {
                        System.out.print(k+" ");
                    }
                    System.out.println(" ");
                    space++;
                }
                else
                {
                    for(int l=1;l<=space-1;l++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=k-1;j<num+1;j++)
                    {

                        System.out.print(j+" ");
                    }
                    k--;
                    space--;
                    System.out.println(" ");

                }
            }
        }

}
