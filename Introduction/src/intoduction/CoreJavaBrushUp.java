package intoduction;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 10;
		String name = "ABC";
		char letter = 'r';
		double deci = 10.35;
		boolean b = false;
		
		System.out.println(myNum);
	
		int[] arry = new int[5];
		arry[0] = 1;
		arry[1] = 2;
		arry[2] = 3;
		arry[3] = 4;
		arry[4] = 5;
		
		System.out.println(arry[0]);
		
		int[] arry2 = {1,2,3,4,5};
		System.out.println(arry2[1]);
		
		String[] arry3 = new String[3];
		arry3[0] = "ABC";
		arry3[1] = "DEF";
		arry3[2] = "GHI";
		System.out.println(arry3[0]);
		
		String[] arry4 = {"ABC", "DEF", "GHI"};
		System.out.println(arry4[1]);
		
		for (int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
		
		for (int i=0; i<arry4.length; i++) {
			System.out.println(arry4[i]);	
		}
		
		for(String s : arry4 )
			System.out.println(s);
	}

}
