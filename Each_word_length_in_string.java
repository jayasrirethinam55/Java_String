package Name;

import java.util.Scanner;

public class Chararray_to_stringobject {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter string");
		
		//String input=obj.next();// it will not consider after space
		
		String input = obj.nextLine();
			
		String [] arr =input.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] +" length is " +arr[i].length());
		}
		
		
		
}
	
}



Result:
Please enter string
java programs
java length is 4
programs length is 8
