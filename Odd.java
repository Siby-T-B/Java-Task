class Odd{
public static void main(String[] args){
int end=10;
int sum=0;
for(int i=1;i<=end;i++){
if(i%2!=0){
sum=sum+i;
}
}
System.out.println(sum);
}
}