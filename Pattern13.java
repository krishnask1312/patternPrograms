public class Pattern13 {
    public static void main(String[] args) {
        int row=5;
        int diff = 4;
        int sum=0;
        for (int i = 1; i <= row; i++) {
            int t=i;
            System.out.print(i+" ");
            for (int j = 2; j <= i; j++) {
              if(j%2!=0) {
                  sum=sum+diff;
                  System.out.print(sum+" ");
                  diff--;
                  t=sum;
              }else {
                  sum=t+diff;
                  System.out.print(sum+" ");
                  diff--;
              }
            }
            sum=0;
            diff=4;
            System.out.println(" ");
        }
    }
}

