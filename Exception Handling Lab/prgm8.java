package week3day2.day4;

// Ques 8,9 ;


import java.util.Scanner;

public class prgm8 {
	public static void main(String[] args) {
		
		int a[] = new int[10];
		String s;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<10;i++) {
			try {
				
				a[i] = Integer.parseInt(scan.next());
				isNegative(a[i]);
				isinRange(a[i]);
				sum = sum+a[i];
				
			}catch(NumberFormatException ne) {
				System.out.println(ne);
				
			}catch(NegativeNumberException nege) {
				System.out.println(nege);
				
			}catch(OutofRangeException re) {
				System.out.println(re);
				
			}
		}
		System.out.println(sum/10.0f);
	}
	
	static void isNegative(int i) throws NegativeNumberException{
		if(i<0) {
			throw new NegativeNumberException();
		}
	}
	
	static void isinRange(int i) throws OutofRangeException{
		if(!(i>=0 && i<=100)) {
			throw new OutofRangeException();
		}
	}
}


class NegativeNumberException extends Exception{
	String msg = "Input should be non negative";

	@Override
	public String toString() {
		return "NegativeNumberException : " + msg;
	}
}

class OutofRangeException extends Exception{
	String msg = "Input should be in the range 1 to 100";
	
	@Override
	public String toString() {
		return "OutofRangeException : " + msg;
	}
	
}