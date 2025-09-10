import java.util.Scanner;

public class calculator {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        double num1,num2;
        int ch;
        double result;
        do{ 
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Dvision");
            System.out.println("5 : Exit");
            System.out.print("Enter the number to perform operations : ");
            ch=sc.nextInt();
            if(ch>=1 && ch<=4){
                System.out.println("Enter the first number : ");
                num1=sc.nextDouble();
                System.out.println("Enter the second number : ");
                num2=sc.nextDouble();
                switch(ch)
                {
                    case 1:
                    result=num1+num2;
                    System.out.println("Sum of the numbers : "+result);
                    System.out.println("");
                    break;

                    case 2:
                    result=num1-num2;
                    System.out.println("Difference between the numbers is : "+result);
                    System.out.println("");
                    break;

                    case 3:
                    result=num1*num2;
                    System.out.println("Product of the numbers : "+result);
                    System.out.println("");
                    break;

                    case 4:
                    if(num2==0)
                    {
                        System.out.println("Invalid result as the number cannot be divided by zero");
                        System.out.println("");
                    }
                    else
                    {
                        result=(num1/num2);
                        System.out.println("Result of the division is : "+result);
                        System.out.println("");
                    }
                    break;
                }
            }
            else if(ch==5)
            {
              System.out.println("Exiting ...");      
            }
            else
            {
                System.out.println("Enter valid number !");
            }
        }while(ch!=5);
        sc.close();
    }
}
