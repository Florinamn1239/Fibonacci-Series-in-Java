import java.util.Scanner;
class Fibbo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int i,c;
        for(i=2; i<n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }

    }
}
