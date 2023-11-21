import java.util.Scanner;
class Convert{
public static void main(String[] args){
Scanner check=new Scanner(System.in);
System.out.println("Enter the Second");
int value=check.nextInt();
System.out.println("The hours"+value/3600);
System.out.println("The Minutes"+value/60);
}
}