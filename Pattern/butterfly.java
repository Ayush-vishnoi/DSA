package Pattern;

public class butterfly {
    public static void main(String[] args) {
        int r=4;
        int c=2*r;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=c-(2*i);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=c-(2*i);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}

