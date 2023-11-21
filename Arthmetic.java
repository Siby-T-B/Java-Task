import java.util.Scanner;
class Arthmetic{
public static void main(String args[]){
Scanner match=new Scanner(System.in);
System.out.println("Enter your first value");
int val1=match.nextInt();
System.out.println("ENter your second value");
int val2=match.nextInt();
System.out.println("ADD"+(val1+val2));
System.out.println("SUB"+(val1-val2));
System.out.println("MUL"+(val1*val2));
System.out.println("DIV"+(val1/val2));
System.out.println("MOD"+(val1%val2));
}
}