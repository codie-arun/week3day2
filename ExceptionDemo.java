package week3day2;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) throws Exception{
		Dog dog = new Dog();
		
		Scanner sc = new Scanner(System.in);
		String classname = sc.next();
		
		Item i = (Item)Class.forName("week3day2."+classname).getConstructor().newInstance();
		//Item i = new StoneItem();
		
		new Child().playWithDog(dog,i);
	}
	
}


abstract class DogExceptions extends Exception{
	public abstract void visit();
}

class DogBiteException extends DogExceptions{

	String msg;
	
	
	
	public DogBiteException(String msg) {
		super();
		this.msg = msg;
	}



	@Override
	public String toString() {
		return "DogBiteException  " + msg;
	}



	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new MyHandler().handle(this);
	}
	
	
}

class DogBarkException extends DogExceptions{
	
	String msg;
		
	public DogBarkException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DogBarkException  " + msg;
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new MyHandler().handle(this);
	}	
	
	
}

class DogHappyException extends DogExceptions{
	
	String msg;
		
	public DogHappyException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DogHappyException  " + msg;
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new MyHandler().handle(this);
	}	
	
	
}


abstract class Item{
	public abstract void execute() throws DogExceptions;
}

class StickItem extends Item{
	
	public StickItem() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() throws DogExceptions{
		// TODO Auto-generated method stub
		throw new DogBiteException("You Beat I Bite");
	}
	
}

class StoneItem extends Item{
	
	public StoneItem() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() throws DogExceptions{
		// TODO Auto-generated method stub
		throw new DogBarkException("You throw I run");
	}
}

class Frisbee extends Item{
	
	public Frisbee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() throws DogExceptions{
		// TODO Auto-generated method stub
		throw new DogBarkException("You throw I catch");
	}
}


class Dog {
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public void play(Item item) throws DogExceptions{
		item.execute();
	}
}


class Child{
	
	public void playWithDog(Dog dog,Item item) throws DogExceptions{
		
		try {
			dog.play(item);
//		}catch(DogBiteException e) {
//			new MyHandler().handle(e);
//		}catch(DogBarkException e) {
//			new MyHandler().handle(e);
		}catch(DogExceptions dee) {
			System.out.println("Exception  "+dee);
			dee.visit();
		}
		
		
	}
	
}


abstract class Handler911{
	public abstract void handle(DogBiteException dbe);
	public abstract void handle(DogBarkException dab);
	public abstract void handle(DogHappyException dhe);
	
	
}

class MyHandler extends Handler911{

	@Override
	public void handle(DogBiteException dbe) {
		// TODO Auto-generated method stub
		System.out.println("Don't worry it won't bite");
	}

	@Override
	public void handle(DogBarkException dab) {
		// TODO Auto-generated method stub
		System.out.println("Give some pedigree");
	}
	
	@Override
	public void handle(DogHappyException dhe) {
		// TODO Auto-generated method stub
		System.out.println("Play Frisbee");
	}
	
	
	
}


