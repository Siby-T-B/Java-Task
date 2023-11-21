class Fibonoci{
public static void main(String[] args){
int val1=0;
int val2=1;
int z;
System.out.println(val1);
System.out.println(val2);
for(int i=0;i<=10;i++)
{
z=val1+val2;
val1=val2;
val2=z;
System.out.println(z);
}
}
}
