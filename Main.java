import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        float a = s.nextFloat();
        System.out.println("Enter the number");
        float b = s.nextFloat();
        float result;
        try {
            result = a/b;
            System.out.println(a+" / "+b+" = "+result);

            
        } catch(ArithmeticException e) {
                    System.out.println("Error"+e);

        }
    }
}
