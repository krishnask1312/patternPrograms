public class Charpattern2
{
    public static void main(String[] args) {
        char row=75;
        int space=5;
        char ch=65;
        for(char i=65;i<=row;i++)
        {
            if(i<=row-5)
            {
                for(int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for(char j=65;j<=ch;j++)
                {
                    System.out.print(j+" ");
                }
                ch++;
                space--;
                System.out.println(" ");
            }
            else
            {

                for(int k=0;k<=space+1;k++)
                {
                    System.out.print(" ");
                }
                for(char j=65;j<ch-1;j++)
                {
                    System.out.print(j+" ");
                }
                ch--;
                space++;
                System.out.println(" ");
            }
        }
    }
}
