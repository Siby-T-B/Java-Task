import java.util.Arrays;
class ArraysExample{
public static void main(String[] args){
int val1[]={2,3,5,6,7,8,9,1};
int val2[]={10,20,30,40,50};
//For each
for(int i:val1){
System.out.println(i);
}
//sort
Arrays.sort(val1);
System.out.println(Arrays.toString(val1));


//DEEP EQUALS
int t1[][]={{1,2},{1,2}};
int t2[][]={{1,2},{1,2}};
System.out.println(Arrays.deepEquals(t1,t2));

//Split
String value="Siby Ramya Backiya Sapna Mohana";
String check[]=value.split(",");
System.out.println(Arrays.toString(check));
}
}