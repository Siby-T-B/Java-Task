import java.util.*;
class Str{
public static void main(String[] args){
Scanner check=new Scanner(System.in);
System.out.println("Enter Your String");
String str1=check.nextLine();
System.out.println(str1.length());
//System.out.println(str1.reverse());
for(int i=str1.length()-1;i>=0;i--){

System.out.println(str1.charAt(i));
}
}
}
 