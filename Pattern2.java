import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colm=row-1;
        int insert=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=colm;j++)
            {
                System.out.print("1");
            }
            for(int k=1;k<=insert;k++)
            {
                System.out.print(insert);
            }
            insert++;
            colm--;
            System.out.println(" ");

        }
    }

}
