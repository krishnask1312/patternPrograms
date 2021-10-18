import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int num=row;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print(j);
            }
            num--;
            System.out.println(" ");
        }
    }
}
