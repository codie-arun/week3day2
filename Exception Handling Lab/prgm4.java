package week3day2.day4;

// Ques 4,5 ;

import java.lang.reflect.Method;

public class prgm4 {
	
	public static void main(String[] args) throws Exception{
		try {
			isStar('1');
		}catch(NotStarException ns)
		{
			System.out.println(ns);
		}
		
			
	}
	
	//Outut:    NotStarException : This is not a star *
	

//	public static void main(String[] args) throws Exception{
//	
//			isStar('1');
//			
//	}
//	
//	Output:
//	
//	Exception in thread "main" NotStarException : This is not a star *
//	at week3day2.day4.prgm4.isStar(prgm4.java:30)
//	at week3day2.day4.prgm4.main(prgm4.java:23)
//	
	
	public static void isStar(char a) throws NotStarException{
		if(a!='*') {
			throw new NotStarException("This is not a star *");
		}
	}
}


class NotStarException extends Exception{
	String msg;
	
	public NotStarException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NotStarException : " + msg;
	}
	
	

}