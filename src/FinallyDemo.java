import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a=sc.nextInt();
        System.out.println("Enter second integer: ");
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println("Result:" + result);
            }catch (ArithmeticException e){
                System.out.println("Divide by zero error");
            }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
