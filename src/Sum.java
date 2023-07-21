import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)

    {
        Scanner getin=new Scanner(System.in);
        int a;
        int b;
        System.out.println("  First Number");
        a=getin.nextInt();
        System.out.println("  Second Number");
        b=getin.nextInt();
        System.out.println(a +" +" + b + "=" + a+b);
    }
}
