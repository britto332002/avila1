import java.util.Scanner;
public class Swapping {
    public  static void main(String[] args)
    {
        Scanner getin=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter 1st Number:");
        a=getin.nextInt();
        System.out.print("Enter 2nd Number:");
        b=getin.nextInt();
        System.out.print("Enter 3rd Number:");
        c=getin.nextInt();
        System.out.println("Before Swapping-");
        System.out.println("x" + "=" + a);
        System.out.println("y"+ "=" + b);
        System.out.println("z"+ "=" + c);
       /* x=y;
        y=z;
        z=x;*/
        System.out.println("After Swapping-");
        System.out.println("x"+ "="+ b);
        System.out.println("y"+ "="+ c);
        System.out.println("z"+ "="+ a);

    }


}
