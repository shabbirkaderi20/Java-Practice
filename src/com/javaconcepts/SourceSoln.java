package com.javaconcepts;

class Poly {
	
	int a= 6;
	
	public int return1() {
		return a;
	}
	
	public void return1(int b) {
		System.out.println(b);
	}
}

class Ply1 extends Poly {
	
	int s =2;
	
	@Override
	public int return1() {
		return s+ 6;
	}
}

public class SourceSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}

interface A{
	
	void compare();
}

interface B extends A{
	
	void sum();
}

class C implements B{


	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compare() {
		// TODO Auto-generated method stub
		
	}
	
	
}
