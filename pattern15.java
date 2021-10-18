import java.util.Scanner;
public class pattern15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int row=0;
        if(t%2==0)
        {
            row=t+65;
        }
        else
        {
            row=t+66;
        }
        int num=row/2;
        int space=1;
        int k=0;

        for(char i=65;i<row;i++)
        {
            if(i<row/2)
            {
                for ( char j = 65; j < space; j++)
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
                for(char l=65;l<=space-1;l++)
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
