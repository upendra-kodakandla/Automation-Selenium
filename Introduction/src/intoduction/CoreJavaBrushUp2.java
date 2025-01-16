package intoduction;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arry2 = {1,2,3,4,5};
		
		for (int i=0; i<arry2.length;i++) {
			if(arry2[i]%2 ==0) {
				System.out.println(arry2[i]);
				break;
			}
			else {
				System.out.println(arry2[i] +": is not a multiple of 2");
			}
		}
		
		ArrayList <String> a = new ArrayList<String>();
		a.add("This");
		a.add("is");
		a.add("the");
		a.add("arraylist");
		a.remove(2);
		System.out.println(a.get(2));
		
		ArrayList <String> al = new ArrayList <String>();
		al.add("This");
		al.add("is");
		al.add("the");
		al.add("arraylist");
	    System.out.println(al.contains("Arraylist"));
	    System.out.println(al.size());
	}

}
