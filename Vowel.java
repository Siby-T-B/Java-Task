import java.util.Scanner;
class Vowel{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
System.out.println("Enter your String");
String check=a.next();
if(check=="a"||check=="e"||check=="i"||check=="o"||check=="u"){
System.out.println("These are vowels");
}else{
System.out.println("These are constant");
}
}
}
 