package Name;

public class Chararray_to_stringobject {

	public static void main(String[] args) {
		
		String msg = "Hi my dear friend";
		
		String[] arr = msg.split(" "); //String array
		
		//System.out.println(arr); //Object
		
		//System.out.println(arr[0]);//Hi 
		//System.out.println(arr[1]);//my
		//System.out.println(arr[2]);//dear
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" length is: "+arr[i].length()); // hi.length
		}
		 
		/*
		for(String new_var:arr)
		{
			System.out.println(new_var.length());
		}*/
		
		
		
}
	
}


Result:-

Hi length is: 2
my length is: 2
dear length is: 4
friend length is: 6

