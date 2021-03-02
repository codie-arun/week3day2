package week3day2.day4;

// Ques 2,3;

public class prgm2 {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.mth1();
	}
}

class Sample{
	
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try
		{
			//System.exit(0);
			int i = 10/0;
			System.exit(0);
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("catch-mth2");
		}
		finally{
			System.out.println("finally-mth2");
		}
	}
}