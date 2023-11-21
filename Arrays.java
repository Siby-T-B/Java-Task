import java.util.Arrays;
class ArraysExample{
public static void main(String[] args){
int val1[]={2,3,5,6,7,8,9,1};
int val2[]={10,20,30,40,50};
//For each
for(int i:val1){
System.out.print(i);
}
//sort
Arrays.sort(val1);
System.out.print(Arrays.toString(val1));
}
}