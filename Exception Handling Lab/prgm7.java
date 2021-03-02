package week3day2.day4;

import java.util.Scanner;

public class prgm7 {
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner s = new Scanner(System.in);
			String str;
			float n,d;
			float res;
			try {
				
				str = s.next();
				isQ(str);
				n = Integer.parseInt(str);
				d = Integer.parseInt(s.next());
				res = n/d;
				System.out.println(res);
			}
			catch(ArithmeticException ae) 
			{
				System.out.println(ae);
			}
			catch(QException qe) 
			{
				System.out.println(qe);
				System.exit(0);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
	public static void isQ(String s) throws QException{
		if(s=="q" || s=="Q") {
			System.out.println("**");
			throw new QException();
		}
	}
}

class QException extends Exception{
		
}

