class Stringmethodex{
public static void main(String args[]){
String value="batch 20 is toxic";
System.out.println(value.contains("toxic"));
System.out.println(value.concat("by birth"));
System.out.println(value.equals("batch 20 is toxic"));
System.out.println(value.equalsIgnoreCase("batch 20 is toxic"));
System.out.println(value.toUpperCase(value));
System.out.println(value.toLowerCase(value));
System.out.println(value.length(value));
//charAt()returns the char that has been  available in the specified index value
System.out.println("charAt():"+value.charAt(4));
//compareTo() returns the lexicographic zero value if the variables are same
System.out.println("compareToIgnoreCase():"+value.compareToIgnoreCase(val));
//compareTo() returns ngative value if both the variable are different
System.out.println("compareTo(): "+value.compareTo("hello"));
//indexOf() returns the value of spcified char 
System.out.println("indexOf(): "+value.indexOf('s'));
//isEmpty()method checks whether the given variable is empty or not 
System.out.println("is(): "+value.isEmpty());
//replace() used to replace the specified word with the specific word with the specified value
System.out.println("replace(): "+value.replace('toxic','vedapuu'));
//substring()method return a part of string by getting start and end index of a string.
System.out.println("substring():"+value.substring(3,11));
//trim()methods removes the starting and ending spaces of a string.
System.out.println("trim():"+value.trim());
//returns te index of last occurrence of the given character 
Systm.out.println("hashCode():"+value.hasCode());
//format() changes the given input in the specified format
System.out.println("format():"+value.format("%x",5));//d,x,s
//join()method is used to set delimiter and join the parameterized values
System.out.println("join():"+String.join("*","mohana","priya","saran"));
 
}
}