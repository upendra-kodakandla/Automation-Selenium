package intoduction;

public class ExcersiceArrayExporlation {
	    
	    public static void main (String[] args) {

	int[] numbers = { 1, 14, 17 ,25 ,35};

	     System.out.println("The first numbers is : " +numbers[0]);
	   
	    for (int i=1; i<numbers.length; i++) {
	    	if(i==numbers.length-1)	{	
	       System.out.println("The last numbers is : " +numbers[i]);
	   }
	   }
	    System.out.println("The reverse numbers are : ");
	    for (int i=numbers.length-1; i>=0; i--)
	   {
	       System.out.println(numbers[i]);
	   }
	    }


}
