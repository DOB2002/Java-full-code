import java.util.Scanner;
class for_each
{
    public static void main(String[] args)
    {
        int num;
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    for(int i=1;i<=10;i++)
    System.out.println(num*i+ " ");
    }
}