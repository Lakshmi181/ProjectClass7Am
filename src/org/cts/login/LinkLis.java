package org.cts.login;

public class LinkLis implements Lis{
	
	private void m3() {
		System.out.println("Met 3");
	}
	
	private void m4() {
		System.out.println("Met 4");
	}

	@Override
	public void m1() {
		System.out.println("Met 1");
	}

	@Override
	public void m2() {
		System.out.println("Met 2");
	}

	public static void main(String[] args) {
		Lis l=new LinkLis();
		l.m1();
		l.m2();
		
	}
}
