class ConstructorEg{
int id;
String name;
ConstructorEg(int i,String n){
id=i;
name=n;
}
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String args[]){
ConstructorEg obj= new ConstructorEg(890,"Santhosh");
ConstructorEg obj1=new ConstructorEg(90,"Siby");
obj.display();
obj1.display();
}
}