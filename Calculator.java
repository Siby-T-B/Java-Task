import java.util.Scanner;
class Calculator{
public static void main(String[] args){
Scanner val=new Scanner(System.in);
System.out.println("Enter your two numbers");
int val1=val.nextInt();
int val2=val.nextInt();
System.out.println("Enter your choice");
System.out.println("+");
System.out.println("-");
System.out.println("*");
System.out.println("/");
System.out.println("%");
String sym=val.next();
switch (sym){
case "+":
System.out.println("Addition"+(val1+val2));
break;
case "-":
System.out.println("Subtract"+(val1-val2));
break;
case "*":
System.out.println("Multiplication"+(val1*val2));
break;
case "/":
System.out.println("Division"+(val1/val2));
break;
case "%":
System.out.println("Modlus"+(val1%val2));
break;
default:
System.out.println("Invalid");
}
}
}



