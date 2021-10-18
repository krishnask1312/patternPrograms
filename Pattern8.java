import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int num=0;
        int j;
        for(int i=1;i<=row;i++)
        {
            for( j=1;j<=num;j++)
            {
                System.out.print(j);
            }
            for(int k=j;k>0;k--)
            {
                System.out.print(k);
            }
            num++;
            System.out.println(" ");
        }

    }
}
