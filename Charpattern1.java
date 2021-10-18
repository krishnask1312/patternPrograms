
public class Charpattern1
{
    public static void main(String[] args) {
        char row=70;
        char ch=70;
        int space=1;
        for(char i=65;i<=row;i++)
        {
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(char j=65;j<=ch;j++)
            {
                System.out.print(j+" ");
            }
            space++;
            ch--;
            System.out.println(" ");

        }
    }
}
