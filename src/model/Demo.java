package model;

import java.util.List;

public class Demo {
	
  public boolean compareString (String str1, String str2) {
	  return (str1.equalsIgnoreCase(str2));
  }
  
  public String concatString (String s) {
	   return s.concat("world"); 
  }
  public int [] addOneToArray(int numbers[]) {
	  int length= numbers.length;
	  int output[]=new int[length];
	  for (int i = 0; i < length; i++) {
		 output[i]=numbers[i]+1;
	} 
	  return output; 
  }
  
   public static void main(String[] args) {
	 List<Integer> nums = null;
	 if (nums == null ) System.out.println("list enmpty");
 	   
}
}
