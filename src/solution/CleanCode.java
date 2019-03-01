package solution;

import java.util.ArrayList;
import java.util.List;

public class CleanCode {
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////
		
		System.out.println("PART ONE\n");
		
		int[][] a = {{1,2,3},{2,7,9}};
		int[][] b = {{2,3,1},{3,6,2}};
		int[][] x = addMatrices(a,b); // method names should be camel case and descriptive
		
		for(int i[] : x) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("" + '\n');
		}
		
		
		
		int[] e = {2,4,8,4,24,10};
		int[] f = {2,4,8,6,3,22};
		
		System.out.println(findIfEvens(e)); //changed method name
		System.out.println(findIfEvens(f)); //changed method name
		System.out.println();
		
		
		
		List<Double> listA = new ArrayList<Double>();
		List<Double> listB = new ArrayList<Double>();
		
		listA.add(2.0);
		listA.add(3.5);
		listA.add(4.2);
		listB.add(2.1);
		listB.add(3.5);
		listB.add(5.9);
		
		System.out.println(compare(listA, listB));
		
		listA.clear();
		listB.clear();
		
		listA.add(1.2);
		listA.add(2.3);
		listA.add(3.4);
		listB.add(4.5);
		listB.add(5.6);
		listB.add(6.7);
		
		System.out.println(compare(listA, listB));
		
	    System.out.println();
	    
	    //////////////////////////////////////////////////////////
		
		System.out.println("PART TWO\n");
		addNumbers(1,2,3,4,5,6,7,8,9,10); //changed method name
		System.out.println(factorial(5)); //changed method name
		
		System.out.println();
		
		//////////////////////////////////////////////////////////
		
		System.out.println("PART THREE\n");
		
		System.out.println(digitMethod(5));
		System.out.println(digitMethod(214));
		
		System.out.println();
		
		System.out.println(contains("kmp"));
		System.out.println(contains("Gary Bishop"));
		
		System.out.println();
		
		System.out.println(isLongString("Computer Science"));
		System.out.println(isLongString("KMP"));
		
		
	}
	
	//PART ONE
	
	//made method name more descriptive and added spaces to be more readable - took away extra blank lines
	public static int[][] addMatrices(int[][] a, int[][] b) {
		
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = a[i][j] + b[i][j];
			}
		}
		return a;
	}
	
	//changed method name to be more descriptive and added some spaces
	// fixed if statement to be less convoluted
	public static boolean findIfEvens(int[] x) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	//changed method name - shouldn't use underscores
	public static <E> boolean compare(List<E> list1, List<E> list2) {
		for(E element1 : list1) {
			for(E element2 : list2) {
				if(element1.equals(element2)) {
					return true;
				}
			}
		}
		return false;
	}
	
	//PART TWO -- focus on whitespace
	// split up long expressions into multiple lines, changed method name to be more descriptive	
	public static void addNumbers(int first, int second, int third, int fourth, 
			int fifth, int sixth, int seventh, int eighth, int ninth, int tenth) {
		System.out.println(first + second + third + fourth + fifth 
				+ sixth + seventh + eighth + ninth + tenth);
	}
	
	// fact isn't very descriptive, so changed method name
	// add spaces so it's easier to read and separate out each line by the curly braces, use proper indents
	public static int factorial(int x) { 
		int s = 1; 
		for(int i = x; i > 0; i--) {
			s *= i;
		}
		return s;
	}
	
	
	//PART THREE -- focus on boolean expressions
	
	// boolean expressions shouldn't return true/false - return statement
	public static boolean digitMethod(int x) {
		return (x > 0 && x < 10); 
	}
	
	// don't need to return true, just return statement
	public static boolean contains(String s) {
		char[] w = s.toCharArray();
		for(int i = 0; i < w.length; i++) {
		    if (w[i] == 'a' || w[i] == 'e' || w[i] == 'i' || w[i] == 'o' || w[i] == 'u'){
			    return true;
		    }
		}
		return false;
	}
	
	// boolean expressions shouldn't return true/false
	public static boolean isLongString(String s) {
		return (s.length() > 8); 
	}

}
