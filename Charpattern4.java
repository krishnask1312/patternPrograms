public class Charpattern4
{

    public static void main(String[] args) {
        char row=75;
        int space=1;
        char ch=65;
        for(char i=65;i<=row;i++)
        {
            if(i<=row-5)
            {
                for(int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for(char j=ch;j<=row-5;j++)
                {
                    System.out.print(j+" ");
                }
                ch++;
                space++;
                System.out.println(" ");
            }
            else
            {

                for(int k=1;k<space-1;k++)
                {
                    System.out.print(" ");

                }
                for(char j = (char) (ch-2); j<=row-5; j++)
                {
                    System.out.print(j+" ");
                }
                ch--;
                space--;
                System.out.println(" ");
            }
        }
    }

}
