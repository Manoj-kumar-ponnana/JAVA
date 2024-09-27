import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=s.nextInt();
        System.out.print("%nEnter the second number value :");
        int num2=s.nextInt();
        System.out.println(String.format("Addition of %d and %d is %d",num1,num2,num1+num2));
        System.out.println(String.format("Substraction of %d and %d is %d",num1,num2,num1-num2));
        System.out.println(String.format("Multiplication of %d and %d is %d",num1,num2,num1*num2));
        System.out.println(String.format("Division of %d and %d is %d",num1,num2,num1/num2));
        System.out.println(String.format("Remainder of %d and %d is %d",num1,num2,num1%num2));
    }
}