import java.util.Scanner;
class Multiply{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your first number");
int val1=scan.nextInt();
System.out.println("Enter your second number");
int val2=scan.nextInt();
System.out.print("product"+(val1*val2));
}
}