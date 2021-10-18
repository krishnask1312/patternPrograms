import java.util.Scanner;
public class Pattern4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int row=sc.nextInt();
        int num=row/2;
        for(int i=1;i<row;i++)
        {
            if(i<=row/2)
            {
                for(int j=1;j<=num;j++)
                {
                    System.out.print(j);
                }
                num--;
                System.out.println(" ");
            }
            else
            {
                for(int j=1;j<=num+2;j++)
                {
                    System.out.print(j);
                }
                num++;
                System.out.println(" ");
            }
        }
    }
}
