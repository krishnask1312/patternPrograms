public class Charpattern5
{
    public static void main(String[] args)
    {
        char row=70;
        char ch=70;
        int space=5;
        for(char i=65;i<=row;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(char k=ch;k<=row;k++)
            {
                System.out.print(k+" ");
            }
            ch--;
            space--;
            System.out.println(" ");

        }

    }
}
