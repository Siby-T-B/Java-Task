class Clock{
public static void main(String[] args){
int x[]={1,2,3,4,5};
int temp[]=new int[1];
temp[0]=x[0];
x[0]=x[x.length-1];
x[4]=temp[0];
for(int i:x){
System.out.println(i);
}
}
}

